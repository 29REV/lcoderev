// Last updated: 1/27/2026, 3:16:13 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int [] res=new int[j+1];
        int r=0;
        while(i<=j){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(a>b){
                res[r++]=a;
                i++;
            }
            else{
                res[r++]=b;
                j--;
            }
        }
        for (int m = 0; m < res.length / 2; m++) {
            int t = res[m];
            res[m] = res[res.length - 1 - m];
            res[res.length - 1 - m] = t;
        }
        return res;
    }
}