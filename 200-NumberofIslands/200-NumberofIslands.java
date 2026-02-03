// Last updated: 2/3/2026, 2:16:53 PM
1class Solution {
2    public void dfs(char[][] grid, int i ,int j){
3        if(i<0 || j<0 || i==grid.length || j== grid[i].length || grid[i][j]=='0'){
4            return;
5        }
6        grid[i][j]='0';
7        dfs(grid,i,j+1);
8        dfs(grid,i+1,j);
9        dfs(grid,i-1,j);
10        dfs(grid,i,j-1);
11    }
12    public int numIslands(char[][] grid) {
13        int count=0;
14        for(int i=0;i<grid.length;i++){
15            for(int j=0;j<grid[i].length;j++){
16                if(grid[i][j]=='1'){
17                    dfs(grid,i,j);
18                    count++;
19                }
20            }
21        }
22        return count;
23    }
24}