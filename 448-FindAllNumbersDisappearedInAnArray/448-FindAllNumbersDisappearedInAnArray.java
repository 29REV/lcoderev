// Last updated: 7/8/2026, 9:12:44 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new LinkedList<>();
        for (int i =0;i<nums.length;i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
        }
        for(int i =1;i<=nums.length ; i++){
            if(!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
}