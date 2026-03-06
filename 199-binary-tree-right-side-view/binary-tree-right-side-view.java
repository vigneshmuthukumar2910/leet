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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        dfs(root,result,0);
        return result;
    }
    private void dfs(TreeNode root,List<Integer> re,int level){
        if(root==null){
            return;
        }
        if(level==re.size()){
            re.add(root.val);
        }
        dfs(root.right,re,level+1);
        dfs(root.left,re,level+1);
    }
}