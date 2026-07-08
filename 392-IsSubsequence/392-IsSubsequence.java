// Last updated: 7/8/2026, 9:12:54 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())return false;
        if (s.isEmpty()){
            return true;
        }
        if (t.isEmpty()){
            return false;
        }
        int i =0;
        int j=0;
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)==t.charAt(j)) {
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i!=s.length()) return false;
        return true;
    }
}