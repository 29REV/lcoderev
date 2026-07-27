// Last updated: 7/27/2026, 2:59:56 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(j) - 'A']);
            while ((j - i + 1) - maxCount > k) {
                count[s.charAt(i) - 'A']--;
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}