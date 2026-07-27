// Last updated: 7/27/2026, 3:01:37 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int currmax=Math.min(height[i],height[j])*(j-i);
            if(currmax>max){
                max=currmax;
            }
            else if(height[i]>height[j]) j--;
            else i++;
        }
        return max;
    }
}