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
    public boolean isBalanced(TreeNode root) {
        int check = helper(root);
        if(check==-1)
            return false;
        else
            return true ;
    }
    public int helper(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int lh = helper(root.left);
        int rh = helper(root.right);
        if(lh==-1 || rh==-1)
        {
            return -1;
        }
        if(Math.abs(lh-rh)>1)
            return -1;
        return Math.max(lh,rh) + 1;
    }
}