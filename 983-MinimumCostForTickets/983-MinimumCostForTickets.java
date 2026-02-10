// Last updated: 2/10/2026, 9:51:56 PM
1class Solution {
2    public int mincostTickets(int[] days, int[] costs) {
3        int n =days[days.length-1];
4        boolean[] month=new boolean[n+1];
5        int [] dp=new int[n+1];
6
7        for(int i:days){
8            month[i]=true;
9        }
10        for(int i=1;i<dp.length;i++){
11            if(month[i]==false){
12                dp[i]=dp[i-1];
13                continue;
14            }
15            int option1=dp[i-1]+costs[0];
16            int option2=dp[Math.max(0,i-7)]+costs[1];
17            int option3=dp[Math.max(0,i-30)]+costs[2];
18            dp[i]=Math.min(option1,Math.min(option2,option3));
19        }
20        return dp[n];
21    }
22}