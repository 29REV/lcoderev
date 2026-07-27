// Last updated: 7/27/2026, 2:59:24 PM
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int j=nums.length-1;
        while(j>1){
        long temp = sum-nums[j];
        if(temp<=nums[j]){
            j--;
            sum=temp;
        }    
        else{
            return sum;
        }
        }
        return -1;
    }
}