// Last updated: 7/27/2026, 2:59:36 PM
class Solution {
    public int minSteps(String s, String t) {
        int arr[] = new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int ct=0;
        for(char c:t.toCharArray()){
            if(arr[c-'a']>0) arr[c-'a']--;
            else{
                ct++;
            }
        }
        return ct;
    }
}