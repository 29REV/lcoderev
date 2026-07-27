// Last updated: 7/27/2026, 2:59:30 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
     int max=0,x=0;
     int maxsq=0;
     for(int i=0;i<dimensions.length;i++){
        x=(dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]); 
        if(x>maxsq){
            maxsq=x;
            max=dimensions[i][0]*dimensions[i][1];
            }
        if(x==maxsq){
            max=(max>dimensions[i][0]*dimensions[i][1])?max:dimensions[i][0]*dimensions[i][1];
        }
     }
     return max;   
    }
}