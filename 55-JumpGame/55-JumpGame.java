// Last updated: 7/8/2026, 9:14:15 AM
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = true; 
        
        for (int i = 0; i < n; i++) {
            if (!dp[i]) continue; 
            for (int jump = 1; jump <= nums[i]; jump++) {
                int end = i + jump;
                if (end < n) {
                    dp[end] = true;
                }
            }
        }
        return dp[n - 1];
    }
}