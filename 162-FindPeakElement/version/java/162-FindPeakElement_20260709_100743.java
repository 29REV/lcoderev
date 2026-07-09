// Last updated: 7/9/2026, 10:07:43 AM
1class Solution {
2    public int findPeakElement(int[] arr) {
3        int n=arr.length;
4        if(n==1){
5            return 0;
6        }
7        else if(arr[0]>arr[1]) return 0;
8        else if (arr[n-1] > arr[n-2]) return n-1;
9        
10        int i =0, j=n-1;
11        while(i<=j){
12            int mid =(i+j)/2;
13            
14            if (arr[mid]>arr[mid+1] && arr[mid]> arr[mid-1]){
15                return mid;
16            }
17            else if (arr[mid+1]>arr[mid]){
18                i=mid+1;
19            }
20            else{
21                j=mid-1;
22            }
23        }
24        return -1;
25    }
26}