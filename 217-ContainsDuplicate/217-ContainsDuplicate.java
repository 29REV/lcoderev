// Last updated: 7/8/2026, 9:13:06 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
}