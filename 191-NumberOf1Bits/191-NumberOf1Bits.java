// Last updated: 1/27/2026, 3:16:31 PM
class Solution {
    public int hammingWeight(int n) {

        int count=0;
        while(n !=0) {
            if ((n & 1) > 0)
                count++;   
            n=n>>1;
    }
    return count;
    }
}