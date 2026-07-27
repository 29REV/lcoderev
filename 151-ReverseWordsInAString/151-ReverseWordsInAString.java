// Last updated: 7/27/2026, 3:00:25 PM
class Solution {
    public String reverseWords(String s) {
        String[] rev = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = rev.length - 1; i >= 0; i--) {
            res.append(rev[i]);
            if (i > 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}
