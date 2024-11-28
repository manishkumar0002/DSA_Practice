package Hashing;

// problem is :--  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum.
public class prefixSum_array {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] prefix = prefixSum(nums);

        int l = 3, r = 7; // Example range [l, r]
        System.out.println("Optimized Sum: " + optimizedSum(prefix, l, r));
    }

    static int[] prefixSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }
    static int optimizedSum(int[] prefix, int l, int r) {
        return prefix[r] - prefix[l - 1];
    }
}
