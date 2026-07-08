// Last updated: 7/8/2026, 9:12:17 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
       String ss=stacktoString(s);
       String ts=stacktoString(t);
       if(ss.equals(ts)) return true;
       return false;
    }
    public String stacktoString(String s){
        int i=0;
        Stack<Character> st = new Stack<>();
        while(i<s.length()){
            if(s.charAt(i)!='#')st.push(s.charAt(i));
            else if (s.charAt(i)== '#' && !st.isEmpty())st.pop();
            i++;
        }
        String sr="";
        while (st.size()>0){
            sr+=(st.pop());
        }
        return sr;
    }
}