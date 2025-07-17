class Solution {
    public int maximumLength(int[] nums, int k) {
        
        if (k == 1) {
            return nums.length;
        }
        int result = 2;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] % k;
        }
        for (int i = 0; i < k; i++) {
            int[] dp = new int[k];
            for (int j = 0; j < nums.length; j++) {
                dp[arr[j]] = dp[(i - arr[j] + k) % k] + 1;
                result = Math.max(result, dp[arr[j]]);
            }
        }
        return result;
    }
}
