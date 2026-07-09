// Last updated: 7/9/2026, 10:21:40 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int maxLength = 0;
5        int[] charIndex = new int[128];
6        for (int j = 0, i = 0; j < n; j++) {
7            char currChar = s.charAt(j);
8            i = Math.max(charIndex[currChar], i);
9            maxLength = Math.max(maxLength, j - i + 1);
10            charIndex[currChar] = j + 1;
11        }
12        return maxLength;
13    }
14}