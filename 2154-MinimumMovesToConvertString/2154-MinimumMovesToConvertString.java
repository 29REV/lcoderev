// Last updated: 7/27/2026, 2:59:33 PM
class Solution {
    public int minimumMoves(String s) {
        int i=0,count=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i+=3;
                count++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}