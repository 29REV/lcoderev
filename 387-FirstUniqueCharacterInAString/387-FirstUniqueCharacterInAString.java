// Last updated: 7/27/2026, 3:00:01 PM
class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        int i=0;
        while(i<s.length()){
            arr[s.charAt(i)-'a']++;
            i++;
        }
        for(i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}