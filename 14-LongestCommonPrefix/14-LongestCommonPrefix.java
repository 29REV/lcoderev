// Last updated: 7/8/2026, 9:14:43 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        Arrays.sort(strs);
        String ans = "";
        for(int i =0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)) ans+=strs[0].charAt(i);
            else return ans;
        }
        return ans;
    }
}