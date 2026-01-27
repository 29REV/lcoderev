// Last updated: 1/27/2026, 3:16:20 PM
class Solution {
    public boolean isPowerOfFour(int n) {

            return((n>0) &&((n &(n-3)) ==0) && (n%3==1));

    }
}