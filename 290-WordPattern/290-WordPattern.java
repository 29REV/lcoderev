// Last updated: 7/27/2026, 3:00:05 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i=0;
        String[] words = s.split(" ");
        if(words.length !=pattern.length()) return false;
        HashMap<Character,String>hm=new HashMap<>();
        while(i<pattern.length()){
            char sc= pattern.charAt(i);
            String tc=words[i];
            if(hm.containsKey(sc)) {
                if(!hm.get(sc).equals(tc)) return false;
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