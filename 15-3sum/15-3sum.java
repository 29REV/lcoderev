// Last updated: 7/8/2026, 9:14:41 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twosum(nums, i, ans);
        }
        return ans;
    }
    public void twosum(int[] arr, int i, List<List<Integer>> ans) {
        int left = i + 1;
        int right = arr.length - 1;
        int target = -arr[i]; 
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}