// Last updated: 7/27/2026, 3:01:42 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            char currChar = s.charAt(j);
            i = Math.max(charIndex[currChar], i);
            maxLength = Math.max(maxLength, j - i + 1);
            charIndex[currChar] = j + 1;
        }
        return maxLength;
    }
}