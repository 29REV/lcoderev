// Last updated: 7/8/2026, 9:12:52 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int ans[] = new int[26];
        for(int i =0 ;i<magazine.length(); i++){
            ans[magazine.charAt(i)-'a']++;
        }
        for(int i =0;i<ransomNote.length();i++){
            if(ans[ransomNote.charAt(i)-'a']==0) return false;
            else ans[ransomNote.charAt(i)-'a']--;

        }
        // for(int i =0;i<ans.length;i++){
        //     if(ans[i]<0) return false;
        // }
        return true;
    }
}