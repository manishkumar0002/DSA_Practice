package Hashing;

import java.util.HashMap;
import java.util.Map;

              // problem of this question is :---
// Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j]

public class count_pairs_sum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int k =6;
        System.out.println("count pairs brute force "+k +"  is :"+bruteForceCountPairs( arr, k ));
        System.out.println("Count pairs sum optimised"+k +" is : "+optimisedCountPairsSum(arr, k));
    }

    //Optimised Approach:-
    // At each Index i, we will find the Complementary Element We need. Now, we will check if this Complementary
    // Element is present in Map Already, we will do cnt++. We will now update entry of our current index element
    // in map.
    private static int optimisedCountPairsSum(int[] arr, int k) {
        int count =0;
        Map<Integer, Integer> seen =new HashMap<>();
        for(int i =0; i < arr.length; ++i){
            int complement =k-arr[i];
            if(seen.containsKey(complement)){
                count++;
            }
            seen.put(arr[i],i);
        }
        return count;
    }
//Brute Force Approach:-
// Iterate over all i and j and check if(arr[i] + arr[j] == k), increment cnt by 1.
// At the end, print this total Count
    private static int bruteForceCountPairs(int[] arr, int k) {
        int count=0;
        for(int i =0; i<arr.length-1; ++i){
            for (int j =i+1; j< arr.length; ++j){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }

}
