// Last updated: 7/8/2026, 9:13:59 AM
class Solution {
    List<List<Integer>> result= new LinkedList<>();
    public void backtrack(int[] nums,int i ,int k,List<Integer> curr){
        // if(i==nums.length){
        //     result.add(new ArrayList<>(curr));
        //     return;
        // }
        if(!result.contains(curr)){
            result.add(new ArrayList<>(curr));
        }
        if(i>= nums.length){
            return;
        }

        curr.add(nums[i]);
        backtrack(nums,i+1,k,curr);
        curr.remove(curr.size()-1);
        backtrack(nums,i+1,k,curr);
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList <Integer> curr= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,nums.length,curr);
        return result;
    }
}