package PrefixArray;

import java.util.HashMap;
import java.util.Map;
 // problem is that : -> Find largest/smallest subarray with sum k in Given Array
public class LargestSumSubArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,-1,6};
        int k =9;
        int [] result=largestSubArraySum(nums,k);

        if(result[0] != -1){
            System.out.println("largest subarray with sum  "+k+"is from index"+result[0]+"to"+result[1]);

        }else{
            System.out.println("No subarray with "+ k);
        }
    }

    private static int[] largestSubArraySum(int[] nums, int k) {

        int maxLen=0;
        int [] result={-1,-1};

        for(int i =0 ; i< nums.length; ++i){
            int currentSum=0;
            for(int j =i; j <nums.length; ++j){
                currentSum +=nums[j];
                if(currentSum ==k && (j-i+1) >maxLen){
                    maxLen=j-i+1;
                    result[0]=i+1;
                    result[1]=j+1;
                }
            }
        }
        return result;

    }
    public static int[] largestSubarraySumK(int[] nums, int k) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1); // Imaginary index -1 for sum 0.
        int currentSum = 0;
        int maxLen = 0;
        int[] result = {-1, -1};

        for (int j = 0; j < nums.length; j++) {
            currentSum += nums[j];

            if (sumIndexMap.containsKey(currentSum - k)) {
                int length = j - sumIndexMap.get(currentSum - k);
                if (length > maxLen) {
                    maxLen = length;
                    result[0] = sumIndexMap.get(currentSum - k) + 1;
                    result[1] = j;
                }
            }

            if (!sumIndexMap.containsKey(currentSum)) {
                sumIndexMap.put(currentSum, j);
            }
        }

        return result;
    }
}
