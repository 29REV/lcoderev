// Last updated: 7/8/2026, 9:14:36 AM
class Solution {
    public boolean isValid(String s) {
        Stack <Character>sh = new Stack<>();
        int i =0;
        while(i<s.length()){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
                sh.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                if(sh.size()<=0 || sh.peek()!='('){
                    return false;
                }
                else{
                    sh.pop();
                }
            }
            else if(s.charAt(i)=='}'){
                if(sh.size()<=0 || sh.peek()!='{'){
                    return false;
                }
                else{
                    sh.pop();
                }
            }
            else if(s.charAt(i)==']'){
                if(sh.size()<=0 || sh.peek()!='['){
                    return false;
                }
                else{
                    sh.pop();
                }
            }
            i++;
        }
        if(sh.isEmpty())
            return true;
        return false;
    }
}