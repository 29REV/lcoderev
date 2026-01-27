// Last updated: 1/27/2026, 3:16:12 PM
class Solution {
    public int findJudge(int n, int[][] edges) {
        int [] in =new int[n+1];
        int [] out = new int[n+1];
        Arrays.fill(in,0);
        Arrays.fill(out,0);
        for(int i =0;i<edges.length;i++){
            out[edges[i][0]]++;
            in [edges[i][1]]++;
    }
    for(int i=1;i<=n;i++){
        if(in[i]==n-1 && out[i]==0){
            return i;
        }
    }
    return -1;
    }
}