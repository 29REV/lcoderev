// Last updated: 7/9/2026, 9:22:33 AM
// I have used the sliding window concept to find the maximum profit.
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        int l=0;
5        for(int i =1;i<prices.length;i++){
6            if(prices[l]>prices[i]){
7                l=i;
8            }
9            else{
10                profit= Math.max(profit,prices[i]-prices[l]);
11            }
12        }
13        return profit;
14    }
15}