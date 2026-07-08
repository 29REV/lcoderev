// Last updated: 7/8/2026, 9:14:07 AM
class Solution {
    List<List<Integer>> result= new LinkedList<>();
    public void backtrack(int[] nums,int i ,int k,List<Integer> curr){
        if(k==curr.size()){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(i>= nums.length){
            return;
        }
        if(nums.length - i < k - curr.size()){
        return;
    }
        curr.add(nums[i]);
        backtrack(nums,i+1,k,curr);
        curr.remove(curr.size()-1);
        backtrack(nums,i+1,k,curr);
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        int nums[]= new int[n];
        for(int i =0;i<n;i++){
            nums[i]=i+1;
        }
        ArrayList <Integer> curr= new ArrayList<>();
        backtrack(nums,0,k,curr);
        return result;
    }
}