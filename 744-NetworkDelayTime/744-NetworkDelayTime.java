// Last updated: 7/27/2026, 2:59:48 PM
import java.util.*;

class Solution {
    class Edge {
        int nbr;
        int wt;
        Edge(int nbr, int wt) {
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<Edge>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < times.length; i++) {
            int src = times[i][0];
            int dest = times[i][1]; 
            int wt = times[i][2];
            graph[src].add(new Edge(dest, wt));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        dist[k] = 0; 
        while (q.size() > 0) {
            int cur = q.poll(); 
            for (Edge e : graph[cur]) {
                int nd = dist[cur] + e.wt;
                if (nd < dist[e.nbr]) {
                    dist[e.nbr] = nd;
                    q.add(e.nbr);
                }
            }
        }
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1; 
            }
            maxTime = Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}