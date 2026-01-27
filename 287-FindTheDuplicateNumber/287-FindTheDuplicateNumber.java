// Last updated: 1/27/2026, 3:16:21 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i]);
            if(nums[idx]<0){
                return Math.abs(nums[i]);
            }
            nums[idx]=-nums[idx];

        }    
        return 0;
    }

}