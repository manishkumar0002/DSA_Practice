package Hashing;

import java.util.Scanner;

public class sum_subArray {
    public static void main(String[] args) {
        // problem is   :  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum.
        //take a inpt(n)
        // input (l.r)
        //input arr[]

        //int sum+=arr[i]
         int [] nums={0,1,2,3,4,5,6,7,8,9};
         int [] prefix=prefixSum(nums);
         int l=3, r=7;

       //  System.out.println("Brute forcw sum  :"+bruteForceSum(nums, l, r));
    }

    private static int[] prefixSum(int[] nums) {
        int n=nums.length;
        int [] prefix= new int[n+1];

        for(int i =1 ; i<=n ; ++i){
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
    static int optimizedSum(int [] prefix , int l , int r){
        return prefix[r]-prefix[l-1];
    }

    private static int bruteForceSum(int[] nums, int l, int r) {

      int sum=0;
      for(int i =l; i<=r ; ++i){
        sum+=nums[i];
      }
      return sum;
    }
}
