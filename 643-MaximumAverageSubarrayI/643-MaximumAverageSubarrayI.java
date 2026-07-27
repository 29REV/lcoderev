// Last updated: 7/27/2026, 2:59:51 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return (double)nums[0];
        int n =nums.length;
        int  sum=0;
        int maxxsum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxxsum=sum;
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxxsum=Math.max(maxxsum,sum);
        }
        return (double)maxxsum/k;
    }
}