// Last updated: 7/27/2026, 3:00:10 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        // if(n==0)return nums;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        List<Integer> result=new LinkedList<>();
        for(Map.Entry<Integer,Integer>mp:hm.entrySet()){
            if(mp.getValue()>n)result.add(mp.getKey());
        }
        return result;

    }
}