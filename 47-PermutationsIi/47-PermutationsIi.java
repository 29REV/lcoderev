// Last updated: 7/8/2026, 9:14:24 AM
class Solution {
     List<List<Integer>> result = new ArrayList<>();
     public void backtrack(int[] nums,int i,List<Integer> current,boolean[] used){
        if(current.size()==nums.length && !result.contains(current)){
            result.add(new ArrayList<> (current));
            return;
        }
        for(int j=0; j<nums.length;j++){
            if(used[j]){
                continue;
            }
            
            current.add(nums[j]);
            used[j]=true;
            backtrack(nums,j+i,current,used);
            used[j]=false;
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums,0,current,used);
        return result;
    }
}