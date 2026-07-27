// Last updated: 7/27/2026, 3:00:17 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int i=0;
        HashMap<Character,Character>hm=new HashMap<>();
        while(i<s.length()){
            char sc= s.charAt(i);
            char tc=t.charAt(i);
            if(hm.containsKey(sc)) {
                if(hm.get(sc) != tc) return false;
            } 
            else {
                if(hm.containsValue(tc)) return false; 
                hm.put(sc, tc);
            }
            i++;
        }
        return true;
    }
}