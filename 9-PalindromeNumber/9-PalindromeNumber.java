// Last updated: 7/27/2026, 3:01:38 PM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,rem=0;
        while(temp>0){
            rem= rem*10 + temp%10;
            temp/=10;
        }
        if(rem==x) return true;
        return false;
    }
}