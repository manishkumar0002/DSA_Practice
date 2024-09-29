package Hashing;

import java.util.HashMap;
import java.util.Map;



// problem :-  Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j]
public class count_pair_sum {
    public static void main(String[] args) {
        int [] arr= {1,5,3,4,2};
        int k =2;
        System.out.println("difference of brute force is  : "+ bruteforceCountPairSum(arr,k));
        System.out.println("Count pairs sum optimised"+k +" is : "+optimisedCountPairSum(arr, k));
    }

    private static int optimisedCountPairSum(int[] arr, int k) {
        int count=0;

        Map<Integer, Integer> freqMap=new HashMap<>();
        for(int i =0; i< arr.length-1; ++i){
            int target=arr[i]+k;
            if(freqMap.containsKey(target)){
                count+= freqMap.get(target);
            }
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1 );
        }

        return count;
    }

    private static int bruteforceCountPairSum(int[] arr, int k) {
        int count=0;
         for(int i =0; i< arr.length-1; ++i){
             for(int j =i+1; j < arr.length; ++j){
                 if((arr[i]-arr[j])==k){
                     count++;
                 }
             }
         }


        return count;


    }
}
