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
    private int temp=0,min=-1;
    public int findBottomLeftValue(TreeNode root) {
      dfs(root,0);
      return temp;
      
        
    }
    private void dfs(TreeNode root,int level){
        if(root==null){
            return;
        }
    
            if( min<level)
            {
            min=level;
            temp=root.val;
        }
        
        dfs(root.left,level+1);
        dfs(root.right,level+1);

    }
}