// Last updated: 7/8/2026, 12:16:48 PM
/*
 * Distance Array Tracking: By checking nd < dist[e.nbr], the algorithm ensures we only queue a node if we've found a strictly quicker way to reach it. This prevents infinite loops.
 * 
 * Result Calculation: At the end, we look for the largest value in our dist array from node 1 to n. If any node still holds Integer.MAX_VALUE, it means the network signal could never reach it, so we return -1.
*/

1import java.util.*;
2
3class Solution {
4    class Edge {
5        int nbr;
6        int wt;
7        Edge(int nbr, int wt) {
8            this.nbr = nbr;
9            this.wt = wt;
10        }
11    }
12    public int networkDelayTime(int[][] times, int n, int k) {
13        List<Edge>[] graph = new ArrayList[n + 1];
14        for (int i = 0; i <= n; i++) {
15            graph[i] = new ArrayList<>();
16        }
17        for (int i = 0; i < times.length; i++) {
18            int src = times[i][0];
19            int dest = times[i][1]; 
20            int wt = times[i][2];
21            graph[src].add(new Edge(dest, wt));
22        }
23        int[] dist = new int[n + 1];
24        Arrays.fill(dist, Integer.MAX_VALUE);
25        Queue<Integer> q = new LinkedList<>();
26        q.add(k);
27        dist[k] = 0; 
28        while (q.size() > 0) {
29            int cur = q.poll(); 
30            for (Edge e : graph[cur]) {
31                int nd = dist[cur] + e.wt;
32                if (nd < dist[e.nbr]) {
33                    dist[e.nbr] = nd;
34                    q.add(e.nbr);
35                }
36            }
37        }
38        int maxTime = 0;
39        for (int i = 1; i <= n; i++) {
40            if (dist[i] == Integer.MAX_VALUE) {
41                return -1; 
42            }
43            maxTime = Math.max(maxTime, dist[i]);
44        }
45        return maxTime;
46    }
47}