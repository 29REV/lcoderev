// Last updated: 7/8/2026, 9:14:00 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer>ans= new ArrayList<>();

        int i=0;
        int j=0;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else{
                ans.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            ans.add(nums1[i]);
            i++;
        }
        while(j<n){
            ans.add(nums2[j]);
            j++;
        }
        for(int k=0;k<ans.size();k++){
            nums1[k]=ans.get(k);
        }
    }
}