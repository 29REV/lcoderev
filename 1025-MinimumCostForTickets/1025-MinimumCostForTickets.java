// Last updated: 7/8/2026, 9:12:12 AM
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n =days[days.length-1];
        boolean[] month=new boolean[n+1];
        int [] dp=new int[n+1];

        for(int i:days){
            month[i]=true;
        }
        for(int i=1;i<dp.length;i++){
            if(month[i]==false){
                dp[i]=dp[i-1];
                continue;
            }
            int option1=dp[i-1]+costs[0];
            int option2=dp[Math.max(0,i-7)]+costs[1];
            int option3=dp[Math.max(0,i-30)]+costs[2];
            dp[i]=Math.min(option1,Math.min(option2,option3));
        }
        return dp[n];
    }
}