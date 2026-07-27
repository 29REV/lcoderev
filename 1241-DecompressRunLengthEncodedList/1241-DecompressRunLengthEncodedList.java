// Last updated: 7/27/2026, 2:59:41 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int k=0;
        int arr[]=new int[size];
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                arr[k++]=(nums[i+1]);
            }
        }
        return arr;
    }
}