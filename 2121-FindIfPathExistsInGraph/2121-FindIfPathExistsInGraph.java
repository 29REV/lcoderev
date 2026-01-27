// Last updated: 1/27/2026, 3:16:16 PM
class Solution {
    public boolean dfs( ArrayList<ArrayList<Integer>> adj, boolean vis[],int s, int d){
        if(s==d){
            return true;
        }
        vis[s]=true;
        for(int i=0;i<adj.get(s).size();i++){
            int curr= adj.get(s).get(i);
            if(!vis[curr]){
                if(dfs(adj,vis,curr,d)) return true;
            }

        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis=new boolean[n];
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0; i<n; i++) 
            adj.add(new ArrayList<>());
    
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);  // Bidirectional
        }
        return dfs(adj,vis,source, destination);
    }
}