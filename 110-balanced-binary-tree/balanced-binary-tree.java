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
    final int ub=-1;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return dfs(root)!=ub;
    }
    private int dfs(TreeNode root){
        if(root.left==null && root.right==null){
            return 1;
        }
        int righth=0;
        if(root.right!=null)
        {
            righth=dfs(root.right);
        }if(righth==ub) return ub;
        int lefth=0;
        if(root.left!=null){
            lefth=dfs(root.left);
        }if(lefth==ub) return ub;
        if(Math.abs(righth-lefth)<=1) return Math.max(righth,lefth)+1;
        return ub;
    }
}