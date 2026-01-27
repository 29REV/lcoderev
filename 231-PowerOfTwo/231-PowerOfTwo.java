// Last updated: 1/27/2026, 3:16:22 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n>0){
            return((n &(n-1)) ==0);
        }
        return false;
    }
}