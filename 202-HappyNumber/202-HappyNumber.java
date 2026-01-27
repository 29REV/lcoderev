// Last updated: 1/27/2026, 3:16:26 PM
class Solution {
    public int sumsq(int n){
        int temp=0;
        while(n!=0){
            int t=n%10;
            temp=temp+t*t;
            n=n/10;
        }return temp;
    }
    public boolean isHappy(int n) {
               boolean flag=false;
               int slow=n;
               int fast=sumsq(n);
               while(fast!=1){
                    fast=sumsq(fast);
                    fast=sumsq(fast);
                    slow=sumsq(slow);
                    if(slow == fast){
                        return false;
                    }

               }
               return true;
               
    }
}