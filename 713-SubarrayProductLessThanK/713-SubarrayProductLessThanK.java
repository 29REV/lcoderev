// Last updated: 7/8/2026, 9:12:21 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        
        int count = 0;
        int currentProduct = 1;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            currentProduct *= nums[right];
            
            while (currentProduct >= k) {
                currentProduct /= nums[left];
                left++;
            }
            
            count += (right - left + 1);
        }
        
        return count;
    }
}