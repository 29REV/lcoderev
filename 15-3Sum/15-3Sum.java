// Last updated: 1/31/2026, 12:16:20 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> res=new ArrayList<>();
5        for(int i=0;i<nums.length-2;i++){
6            if (i > 0 && nums[i] == nums[i - 1]) continue;
7            int low=i+1;
8            int high=nums.length-1;
9            while(low<high){
10                int sum =nums[i]+nums[low]+nums[high];
11                if(sum==0){
12                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
13                    low++;high--;
14                    while(low<high && nums[low]==nums[low-1]){
15                        low++;
16                    }
17                    while(low<high && nums[high]==nums[high+1]){
18                        high--;
19                    }
20                }
21                else if(sum>0){
22                    high--;
23                }
24                else{
25                    low++;
26                }
27            }
28        }
29        return res;
30    }
31}