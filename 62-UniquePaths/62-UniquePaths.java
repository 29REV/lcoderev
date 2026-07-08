// Last updated: 7/8/2026, 9:14:13 AM
class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D table to store the number of paths for each cell
        int[][] dp = new int[m][n];
        
        // Base case: Fill the first row with 1s
        for (int c = 0; c < n; c++) {
            dp[0][c] = 1;
        }
        
        // Base case: Fill the first column with 1s
        for (int r = 0; r < m; r++) {
            dp[r][0] = 1;
        }
        
        // Fill the rest of the DP table
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
            }
        }
        
        // The bottom-right corner holds the total unique paths
        return dp[m - 1][n - 1];
    }
}