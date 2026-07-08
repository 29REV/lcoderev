// Last updated: 7/8/2026, 9:14:38 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closesum = nums[0]+nums[1]+nums[2];
        int left,right;
        for (int i =0;i<nums.length-2;i++){
            left = i+1;
            right= nums.length-1;
            while(left<right){
                int currsum = nums[i]+nums[left]+nums[right];
                if (Math.abs(target - currsum) < Math.abs(target - closesum)) {
                    closesum = currsum;
                }
                if(currsum<target){
                    left++;
                }
            // if(currsum==target) return closesum;
                else if(currsum>target){
                    right--;
                }
                else {
                    return currsum;
                }
            }
        }
        return closesum;
    }
}