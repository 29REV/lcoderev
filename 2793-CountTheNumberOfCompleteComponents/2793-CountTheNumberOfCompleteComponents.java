// Last updated: 1/27/2026, 3:16:14 PM
class Solution {
    public boolean bfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int s){
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        int v=0; 
        int e=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            v++;
            e+=adj.get(temp).size();
            for(int i=0; i<adj.get(temp).size(); i++){
                if(!vis[adj.get(temp).get(i)]){
                    vis[adj.get(temp).get(i)]=true;
                    q.add(adj.get(temp).get(i));
                }
            }
        } 
        e=e/2;
        return (e==(int)v*(v-1)/2);
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
             adj.get(edges[i][1]).add(edges[i][0]);
        }
           boolean[] visited=new boolean[n];
           int ans=0;
        for(int i=0;i<n;i++){
            if(!visited[i] && bfs(adj,visited,i)){
                ans++;
            }
        }
        return ans;
    }
}