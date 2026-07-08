// Last updated: 7/8/2026, 9:14:11 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        
        // Edge case: If starting point is blocked, 0 paths are possible
        if (arr[0][0] == 1) {
            return 0;
        }

        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        
        // 1. Initialize the first column (can only move down)
        for (int i = 1; i < m; i++) {
            dp[i][0] = (arr[i][0] == 0 && dp[i - 1][0] == 1) ? 1 : 0;        
        }

        // 2. MISSING PIECE: Initialize the first row (can only move right)
        for (int j = 1; j < n; j++) {
            dp[0][j] = (arr[0][j] == 0 && dp[0][j - 1] == 1) ? 1 : 0;
        }
        
        // 3. Fill the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 1) {
                    dp[i][j] = 0; 
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        
        return dp[m - 1][n - 1];
    }
}