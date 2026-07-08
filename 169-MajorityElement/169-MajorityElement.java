// Last updated: 7/8/2026, 9:13:19 AM
class Solution {
    public int majorityElement(int[] nums) {
        // HashMap <Integer,Integer> hm = new HashMap<>();
        // for (int i =0;i < nums.length; i++){
        //     if(!hm.containsKey(nums[i])){
        //         hm.put(nums[i],1);
        //     }
        //     else{
        //         hm.put(nums[i],hm.get(nums[i])+1);
        //     }
        // }
        // Map.Entry<Integer, Integer> maxEntry = null;
        // for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        //     if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
        //         maxEntry = entry;
        //     }
        // }
        // return maxEntry.getValue()>=nums.length/2? maxEntry.getKey():0;

        int count =0;
        int cand = -1;
        for(int num: nums){
            if(count == 0){
                cand = num;
            }
            count+=(cand == num)?1:-1;
        }
        return cand;
    }
}