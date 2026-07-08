// Last updated: 7/8/2026, 9:14:46 AM
class Solution {
    public int myAtoi(String s) {
        int sign =1;
        s=s.trim();
        int res =0;
        int n =s.length();
        int i =0;
        if(s.isEmpty()){
            return 0;
        }
        if(s.charAt(0)=='-'){
            sign = -1;
            i++;
        }
        if(s.charAt(0)=='+'){
            sign =1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if (res > (Integer.MAX_VALUE - digit) / 10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res*10+digit;
            i++;
        }
        
        return res*sign;
    }
}