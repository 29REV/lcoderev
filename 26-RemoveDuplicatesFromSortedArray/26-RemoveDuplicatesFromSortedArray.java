// Last updated: 1/27/2026, 3:16:40 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i =0,count=0;
        while(i<n-1-count){
            if(nums[i]==nums[i+1]){
                for(int j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                count++;
            }
            else{
                i++;
            }
        }
        return n-count;
    }
}
