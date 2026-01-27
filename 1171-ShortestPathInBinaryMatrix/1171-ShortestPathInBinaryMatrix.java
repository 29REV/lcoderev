// Last updated: 1/27/2026, 3:16:17 PM
class Solution {
    
    public int bfs(int[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        vis[0][0] = true;
        
        int level = 1;
        
        // 8 directions
        int[][] dir = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1},
            {1, 1}, {-1, -1}, {1, -1}, {-1, 1}
        };
        
        while (!q.isEmpty()) {
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                
                if (r == n - 1 && c == m - 1) {
                    return level;
                }
                
                for (int[] d : dir) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    
                    if (nr >= 0 && nc >= 0 && nr < n && nc < m &&
                        !vis[nr][nc] && grid[nr][nc] == 0) {
                        
                        vis[nr][nc] = true;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
            level++;
        }
        return -1;
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        
        boolean[][] vis = new boolean[n][n];
        return bfs(grid, vis);
    }
}