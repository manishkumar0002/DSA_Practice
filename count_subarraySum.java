package Hashing;

public class count_subarraySum {

    // problem is : Find count of shortest/largest subarrays with sum k in given array
    public static void main(String[] args) {
        int [] nums={1,2,3,4,2,5};
        int k =5;

        System.out.println("shortest subarray with sum "+ k +":" +countShortestSubArrayWithSum(nums, k));
        System.out.println("Largest subarray with sum "+ k + ": "+countLargestSubarrayWithSum(nums, k));
    }

    private static int countLargestSubarrayWithSum(int[] nums, int k) {
             int n =nums.length;
             int maxLength=0,count=0;


             for(int start=0; start < n ; start++){
                 int sum=0;
                 for (int end=start; end < n ; end++){
                     sum+= nums[end];
                     if(sum ==k ){
                         int length =end-start+1;
                         if(length > maxLength){
                             maxLength=length;
                             count=1;
                         }else if(length == maxLength){
                             count++;
                         }

                     }

                 }
             }
             return count;
    }

    private static int countShortestSubArrayWithSum(int[] nums, int k) {

        int n = nums.length;
        int minLength=Integer.MAX_VALUE, count=0;

        for(int start=0; start < n ; start++){
            int sum=0;
            for(int end =start=0;end < n ; end++){
                sum+=nums[end];
                if(sum==k){
                    int length=end-start+1;

                    if(length < minLength){
                        minLength=length;
                        count=1;
                    }else if(length == minLength){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
