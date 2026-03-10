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
    int d=0;
    TreeNode lca;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        bfs(root,0);
        return lca;
        
    }
    private int bfs(TreeNode root,int depth){
        d=Math.max(d,depth);
        if(root==null) return depth;
        int left=bfs(root.left,depth+1);
        int right=bfs(root.right,depth+1);
        if(left==d && right==d){
            lca=root;
        }
        return Math.max(left,right);
    }
}