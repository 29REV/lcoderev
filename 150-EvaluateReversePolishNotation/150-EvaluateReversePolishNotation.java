// Last updated: 1/27/2026, 3:16:32 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack<>();
        for(int i=0; i< tokens.length;i++){
            String c= tokens[i];
            if(!c.equals("+") && !c.equals("-") && !c.equals("*")&&!c.equals("/")){
                st.push(Integer.parseInt(c));
            }
            else{
                int val1=st.pop();
                int val2=st.pop();
                if(c.equals("+")){
                    int temp=val2 +val1;
                    st.push(temp);
                }else if(c.equals("-")){
                    int temp=val2 -val1;
                    st.push(temp);
                }else if(c.equals("/")){
                    int temp=val2 /val1;
                    st.push(temp);
                }else if(c.equals("*")){
                    int temp=val2 *val1;
                    st.push(temp);
                }
            }
        }
        int result=st.pop();
        return result;
    }
}