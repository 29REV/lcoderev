// Last updated: 7/27/2026, 2:59:27 PM
class Solution {
    public int minimumPushes(String word) {
        Integer arr[] = new Integer[26];
        Arrays.fill(arr, 0);
        for(char c: word.toCharArray()){
            arr[c-'a']++;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int cost=0;
        for(int i =0;i<arr.length && arr[i]>0;i++){
            cost+=arr[i] * (i/8 + 1);
        }
        return cost;
    }
}