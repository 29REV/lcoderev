// Last updated: 7/27/2026, 3:01:29 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && arr[0]==-1){
                arr[0]=i;
            }
            if(nums[i]==target){
                arr[1]=i;
            }
        }
        return arr;

    }
}