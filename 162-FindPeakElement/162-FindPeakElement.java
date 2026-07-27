// Last updated: 7/27/2026, 3:00:23 PM
class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 0;
        }
        else if(arr[0]>arr[1]) return 0;
        else if (arr[n-1] > arr[n-2]) return n-1;
        
        int i =0, j=n-1;
        while(i<=j){
            int mid =(i+j)/2;
            
            if (arr[mid]>arr[mid+1] && arr[mid]> arr[mid-1]){
                return mid;
            }
            else if (arr[mid+1]>arr[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
}