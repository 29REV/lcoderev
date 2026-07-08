// Last updated: 7/8/2026, 9:12:16 AM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int[][] cars = new int[position.length][2];
         for (int i =0;i<position.length;i++){
            cars[i][0] = position[i]; 
            cars[i][1] = speed[i];
         }
         Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
         Stack<Double> st = new Stack<>();
         for (int i =0;i<position.length;i++){
            Double time = (double)(target - cars[i][0])/cars[i][1];
            if(st.isEmpty()||time > st.peek()){
                st.push(time);
            }
         }
         return st.size();

    }
}