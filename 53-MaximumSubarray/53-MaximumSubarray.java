// Last updated: 7/8/2026, 9:14:19 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        int maxsum=dp[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
            if(dp[i]>maxsum)
                maxsum=dp[i];
        }
        return maxsum;
    }
}