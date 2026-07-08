// Last updated: 7/8/2026, 9:12:06 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int newarr[]=new int [nums.length*2];
        for(int i=0;i<nums.length*2;i++){
            newarr[i]=nums[i%nums.length];
        }
        return newarr;
    }
}