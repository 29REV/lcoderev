// Last updated: 7/8/2026, 9:14:09 AM
class Solution {
    public int climbStairs(int n) {
       int mem[]=new int[n+1];
       return helper(n,mem);
    }
    public int helper(int n ,int[]mem){
        if(n==0||n==1){
            return 1;
        }
        else if(n<0) return 0;
        else if(mem[n]!=0) return mem[n];
        return mem[n]=helper(n-1,mem)+helper(n-2,mem);
    }
}