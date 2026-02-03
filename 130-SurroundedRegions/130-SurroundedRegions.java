// Last updated: 2/3/2026, 4:28:03 PM
1class Solution {
2    public void dfs(char[][] board,int i,int j,boolean[][] visit){
3        if(i<0 || j<0 || i>=board.length|| j>=board[i].length ){
4            return;
5        }
6        if(board[i][j]=='X'|| visit[i][j]){
7            return;
8        }
9        visit[i][j]=true;
10        dfs(board,i,j+1,visit);
11        dfs(board,i,j-1,visit);
12        dfs(board,i+1,j,visit);
13        dfs(board,i-1,j,visit);
14    }
15    public void solve(char[][] board) {
16        boolean visit[][] =new boolean[board.length][board[0].length];
17       int i=0,j=0;
18        for (i=0;i<board.length;i++){
19            if(board[i][j]=='O'|| board[i][board[0].length-1] =='O'){
20            dfs(board,i,j,visit);
21            dfs(board,i,board[0].length-1,visit);
22        }
23        }
24        i=0;
25        for(j=0;j<board[0].length;j++){
26             if(board[i][j]=='O' || board[board.length-1][j]=='O'){
27            dfs(board,i,j,visit);
28            dfs(board,board.length-1,j,visit);
29             }
30        }
31        for(i=0;i<board.length;i++){
32            for(j=0;j<board[i].length;j++){
33                if(board[i][j]=='O' && visit[i][j]==false){
34                    board[i][j]='X';
35                }
36            }
37        }
38    }
39}