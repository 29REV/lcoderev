// Last updated: 7/9/2026, 1:46:32 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] count = new int[26];
4        int maxCount = 0;
5        int maxLength = 0;
6        int i = 0;
7        for (int j = 0; j < s.length(); j++) {
8            maxCount = Math.max(maxCount, ++count[s.charAt(j) - 'A']);
9            while ((j - i + 1) - maxCount > k) {
10                count[s.charAt(i) - 'A']--;
11                i++;
12            }
13            maxLength = Math.max(maxLength, j - i + 1);
14        }
15        return maxLength;
16    }
17}