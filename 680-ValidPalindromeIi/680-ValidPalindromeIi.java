// Last updated: 7/8/2026, 9:12:28 AM
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPurePalindrome(s, i + 1, j) || isPurePalindrome(s, i, j - 1);
            }
        }
        return true;
    }
    

    private boolean isPurePalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
