// Last updated: 7/8/2026, 9:14:40 AM
class Solution {
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void backtrack(List<String>result,String digits,String current,int i ){
        if(i==digits.length()){
            result.add(current);
            return;
        }
        String letters=map[digits.charAt(i)-48];
        for(char c:letters.toCharArray() ){
            backtrack(result,digits,current +c,i+1);
        }
    }
     

    public List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        backtrack(result,digits,"",0);
        return result;
    }
}