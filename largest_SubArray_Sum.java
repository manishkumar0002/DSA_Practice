package Hashing;

public class largest_SubArray_Sum {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,-1,6};
        int k =9;
        int [] result=largestSubarraysu(nums,k);
        if (result[0] != -1) {
            System.out.println("largest sunarray with sum " + k + " is from index " + result[0] + "to" + result[1]);
        }else {
            System.out.println("no subarray with sum  "+k);
        }
    }

    private static int[] largestSubarraysu(int[] nums, int k) {
       int maxlen=0;
       int[] result={-1,-1};

       for (int i =0; i<=nums.length; i++){
          int currentSum=0;
          for (int j =i ; j< nums.length; j++){
              currentSum+=nums[j];
              if (currentSum==k && (j-i+1) > maxlen){
                  maxlen=j-i+1;
                  result[0]=i+1;
                  result[j]=j+1;
              }
          }
       }
       return result;
    }
}
