// Last updated: 7/8/2026, 9:14:32 AM
class Solution {
    public int removeElement(int[] arr, int val) {
        // if(arr.length == 1) return 0;
        int i =0;
        int j= arr.length-1;
        while(i<=j){
            if (arr[i]==val){
                arr[i]=arr[j];
                j--;
            }
            else {
                i++;
            }
        }
        return i;
    }
}