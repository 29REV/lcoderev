// Last updated: 7/8/2026, 9:14:31 AM
class Solution {
    List<List<Integer>> result =new ArrayList<>();
   
    public int sum(List<Integer> nums){
        int sum =0;
        for (int number : nums) {
            sum += number;
        }
        return sum;

    }
    public void backtrack(int[] nums,int i,List<Integer> current,int target){
        if(sum(current)==target){
            result.add(new ArrayList<> (current));
            return;
        }
        if (i==nums.length|| sum(current)<0 || sum(current)>target){
            return;
        }
        current.add(nums[i]);
        backtrack(nums,i,current,target);
        
        current.remove(current.size()-1);
        backtrack(nums,i+1,current,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>current = new ArrayList<>();
        backtrack(candidates,0,current,target);
        return result;
    }
}