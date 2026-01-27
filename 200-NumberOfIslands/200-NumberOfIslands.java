// Last updated: 1/27/2026, 3:16:28 PM
class Solution {
    public void dfs(char[][] grid, boolean vis[][], int start[]){
        int i=start[0];
        int j=start[1];
        vis[i][j]=true;
        int child[][]={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0; k<child.length; k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length &&i>=0 && j>=0 && vis[i][j]==false && grid[i][j]=='1'){
                dfs(grid,vis,new int[]{i,j});
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int answer=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                    dfs(grid, vis, new int[]{i,j});
                    answer++;
                }
            }
        }
        return answer;
    }
}