// Last updated: 7/8/2026, 9:12:49 AM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hm= new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean hasOddLeftover = false;
        for (int count : hm.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOddLeftover = true; 
            }
        }
        if (hasOddLeftover) {
            length += 1;
        }
        return length;
    }
}