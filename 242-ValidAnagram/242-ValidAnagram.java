// Last updated: 7/8/2026, 9:13:02 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // HashMap<Character,Integer> hm = new HashMap<>();
        // for(int i = 0; i < s.length() ; i++){
        //     char c = s.charAt(i);
        //     char b = t.charAt(i);
        //     if(!hm.containsKey(c)){
        //         hm.put(c,1);
        //     }
        //     else if(hm.containsKey(c))
        //         hm.put(c,hm.get(c)+1);
        //     if(hm.containsKey(b))
        //         hm.put(b,hm.get(b)-1);
        //     else if (!hm.containsKey(b))
        //         hm.put(b,-1);
        // }   
        // for (int i=0;i< s.length();i++){
        //     char c = s.charAt(i);
        //     if(hm.get(c)!= 0){
        //         return false;
        //     }
        // }
        // return true;

        int arr[] = new int[26];
        for(int i =0;i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i =0 ; i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}