// Last updated: 1/27/2026, 3:16:37 PM
class Solution {
    public int mySqrt(int x) {
        int i =0,j=x,ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            long sq=(long)mid*mid;
            if(sq==x){
                ans=mid;
                break;
            }
            else if(sq<x){
                ans=mid;
                i=mid+1;
            }
            else if(sq>x){
                j=mid-1;
            }
        }
        return ans;
    }
}