// Last updated: 7/8/2026, 9:13:04 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String>result = new LinkedList<>();
    public void backtrack(TreeNode root, String path){
        if(root == null) return;
        if(path.length()==0){
            path= root.val+"";
        }
        else{
            path= path+"->"+root.val;
        }
        if(root.left ==null && root.right== null){
            result.add(path);
            return;
        }
        backtrack(root.left,path);
        backtrack(root.right,path);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return result;

        backtrack(root,"");
        return result;
    }
}