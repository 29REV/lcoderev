// Last updated: 7/8/2026, 9:13:21 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j = numbers.length-1;
        int[] ans = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            else if(numbers[i]+numbers[j] == target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else j--;
        }
        return ans;
    }
}