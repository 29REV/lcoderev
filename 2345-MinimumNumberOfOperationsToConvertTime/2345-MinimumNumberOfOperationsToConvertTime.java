// Last updated: 7/8/2026, 9:12:04 AM
class Solution {
    public int convertTime(String current, String correct) {
        
        int hour= Integer.parseInt(current.substring(0, 2));
        int min = Integer.parseInt(current.substring(3));
        int correcthour= Integer.parseInt(correct.substring(0, 2));
        int correctmin = Integer.parseInt(correct.substring(3));
        int curt=hour*60+min;
        int cort=correcthour*60+correctmin;
        int diff=cort -curt;
        int operations[] ={60,15,5,1};
        int count=0;
        for(int i=0;i<operations.length;i++){
            int ope= diff/operations[i];
            if(ope>0){
                diff=diff%operations[i];
                count+=ope;
            }
        }
        return count;
    }
}