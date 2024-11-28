package Hashing;

import java.util.HashMap;
// here the solution of optimised is prefix sum abs named
public class abs_count_pair {
    public static void main(String[] args) {
        int [] arr={1,7,5,9,2,12,3};
        int k =2;

        System.out.println("Number of pairs : "+ countPairs(arr,k));
        System.out.println(countPairsWithDifferenceK( arr, k) );
    }
    public static int countPairsWithDifferenceK(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int j = 0; j < arr.length; ++j) {
            if (freq.containsKey(arr[j] - k)) {
                count += freq.get(arr[j] - k);
            }
            if (k != 0 && freq.containsKey(arr[j] + k)) { // to avoid double counting when k = 0
                count += freq.get(arr[j] + k);
            }

            freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);
        }

        return count;
    }
    private static int countPairs(int[] arr, int k) {
       int count=0;
       for (int i =0; i< arr.length-1; ++i){
           for (int j =i+1; j < arr.length; ++j){
               if (Math.abs(arr[i]-arr[j])==k){
                   count++;
               }
           }
       }
        return count;
    }
}
