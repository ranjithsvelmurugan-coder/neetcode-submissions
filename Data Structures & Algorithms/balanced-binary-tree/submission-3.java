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
    public int cal(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(cal(root.left),cal(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int h1 = cal(root.left);
        int h2 = cal(root.right);
        if(Math.abs(h2-h1)>1){
            return false ;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
