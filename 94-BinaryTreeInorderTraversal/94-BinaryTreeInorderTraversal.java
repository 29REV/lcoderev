// Last updated: 7/27/2026, 3:00:34 PM
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
    public void dfs(TreeNode root,List<Integer> result){
        if(root==null) return;
        dfs(root.left,result);
        result.add(root.val);
        dfs(root.right,result);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>result = new LinkedList<>();
        dfs(root,result);
        return result;
    }
}