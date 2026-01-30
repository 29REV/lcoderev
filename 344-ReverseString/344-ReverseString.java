// Last updated: 1/30/2026, 10:04:08 AM
1class Solution {
2    public void reverseString(char[] s) {
3        int i=0,j=s.length-1;
4        while(i<j){
5            char temp=s[i];
6            s[i]=s[j];
7            s[j]=temp;
8            i++;j--;
9        }
10        return;
11    }
12}