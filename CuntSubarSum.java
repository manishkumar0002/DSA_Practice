package PrefixArray;

public class CuntSubarSum {
    // problem :->> Find count of shortest/largest subarrays with sum k in given array
    public static void main(String[] args) {
        int [] arr={1,2,3,3,2,5};
        int k =5;
        System.out.println("shortest subarray with sum " +  k + ": " +countShortestSubarrayWithSum(arr,k));
        System.out.println("Largest subarrays with sum " + k + ": " + countLargestSubarraysWithSumK(arr, k));
    }

    private static int countShortestSubarrayWithSum(int[] arr, int k) {
        int n =arr.length;
        int minLength=Integer.MAX_VALUE;
        int count =0;

        for (int start =0 ; start < n ; start++){
            int sum =0;
            for (int end =start; end < n ; end++){

                sum+= arr[end];
                if (sum==k){
                    int length =end-start+1;
                    if (length <minLength){
                        minLength=length;
                        count =1;
                    }else if (length == minLength){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int countLargestSubarraysWithSumK(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0, count = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == k) {
                    int length = end - start + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        count = 1;
                    } else if (length == maxLength) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
