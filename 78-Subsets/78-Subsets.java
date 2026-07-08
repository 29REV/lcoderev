// Last updated: 7/8/2026, 9:14:04 AM
class Solution {
    List<List<Integer>> result =new ArrayList<>();
    public void backtrack(int[] nums,int i,List<Integer> current){
        if(i==nums.length){
            result.add(new ArrayList<> (current));
            return;
        }
        current.add(nums[i]);
        backtrack(nums,i+1,current);
        current.remove(current.size()-1);
        backtrack(nums,i+1,current);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current= new ArrayList<>();
        backtrack(nums,0,current);
        return result;
    }
}