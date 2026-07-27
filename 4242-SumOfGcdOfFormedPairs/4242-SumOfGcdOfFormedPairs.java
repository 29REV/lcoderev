// Last updated: 7/27/2026, 2:59:29 PM
class Solution {
    public int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }

    public long gcdSum(int[] nums) {
        long sum=0;
        int n=nums.length;
        int arr[]=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=Math.max(arr[i-1],nums[i]);
        }
        for(int i=0;i<n;i++){
            arr[i]=findGCD(nums[i],arr[i]);
        }
        Arrays.sort(arr);
        int start=0;
        int end=n-1;
        while(start<end){
            sum+=findGCD(arr[start],arr[end]);
            start++;end--;
        }
        return sum;
    }
}