// Last updated: 7/9/2026, 9:54:03 AM
// I first used a for loop to find the sum and then used another to find the other sum. Comparing and finsding the maximm sum and then i found the average.
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        if(nums.length==1) return (double)nums[0];
4        int n =nums.length;
5        int  sum=0;
6        int maxxsum=0;
7        for(int i=0;i<k;i++){
8            sum+=nums[i];
9        }
10        maxxsum=sum;
11        for(int i=k;i<n;i++){
12            sum-=nums[i-k];
13            sum+=nums[i];
14            maxxsum=Math.max(maxxsum,sum);
15        }
16        return (double)maxxsum/k;
17    }
18}