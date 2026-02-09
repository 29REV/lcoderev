// Last updated: 2/9/2026, 4:22:50 PM
1class Solution {
2    public int convertTime(String current, String correct) {
3        
4        int hour= Integer.parseInt(current.substring(0, 2));
5        int min = Integer.parseInt(current.substring(3));
6        int correcthour= Integer.parseInt(correct.substring(0, 2));
7        int correctmin = Integer.parseInt(correct.substring(3));
8        int curt=hour*60+min;
9        int cort=correcthour*60+correctmin;
10        int diff=cort -curt;
11        int operations[] ={60,15,5,1};
12        int count=0;
13        for(int i=0;i<operations.length;i++){
14            int ope= diff/operations[i];
15            if(ope>0){
16                diff=diff%operations[i];
17                count+=ope;
18            }
19        }
20        return count;
21    }
22}