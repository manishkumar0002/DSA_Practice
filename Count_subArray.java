package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Count_subArray {

    // problem is : Find count of number of subarrays with sum ==  k
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        int k=5;
        System.out.println("number of subarray with sum in bruteforce :   "+ countSubarrayBruteForce(arr, k));
        System.out.println("Number of subarray with sum optimized  : "+countSubArraySumOptimized(arr,k));
    }

    private static int  countSubArraySumOptimized(int[] arr, int k) {
        Map<Integer, Integer> prefixSumCount=new HashMap<>();
        int sum=0,count=0;
        prefixSumCount.put(0,1);
        for(int num : arr){
            sum+=num;

            if(prefixSumCount.containsKey(sum-k)){
                count+=prefixSumCount.get(sum-k);
            }
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum,0)+1);
        }
        return count;
    }

    private static int countSubarrayBruteForce(int[] arr, int k) {

        int n =arr.length;
        int count=0;

        for(int i =0 ; i< n ; i++){
             int sum=0;
            for(int j=i; j <n ; j++){
                sum+=arr[j];
                if(sum==k ){
                    count++;
                }
            }
        }
        return count;

    }


}
