// Last updated: 1/28/2026, 7:20:26 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap <Integer,Integer> hm =new HashMap<>();
4        int res[]=new int[2];
5        for(int i=0;i<nums.length;i++ ){
6            int n= target - nums[i];
7            if(hm.containsKey(n)){
8                res[0]=hm.get(n);
9                res[1]=i;
10                return res;
11            }
12            else{
13                hm.put(nums[i],i);
14            }
15        }
16        return res;
17    }
18}