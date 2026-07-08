// Last updated: 7/8/2026, 9:14:17 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] current = intervals[0];
        int n = intervals.length;
        for(int i =1;i<n;i++){
            if(current[1]>=intervals[i][0]){
                current [1]= Math.max(current[1],intervals[i][1]);
                }
            else{
                result.add(new int[]{current[0], current[1]});
                current = intervals[i];
            }
            }
        result.add(new int[]{current[0], current[1]});
        return result.toArray(new int[result.size()][]);
    }
}