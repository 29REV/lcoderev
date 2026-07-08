// Last updated: 7/8/2026, 9:14:28 AM
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
        if(target==0){
            result.add(new ArrayList<> (current));
            return;
        }
        
        for(int j =i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
            if(nums[j]>target){
                break;
            }
            current.add(nums[j]);
            backtrack(nums,j+1,current,target-nums[j]);
            current.remove(current.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<Integer>current = new ArrayList<>();
         Arrays.sort(candidates);
        backtrack(candidates,0,current,target);
        return result;
    }
}