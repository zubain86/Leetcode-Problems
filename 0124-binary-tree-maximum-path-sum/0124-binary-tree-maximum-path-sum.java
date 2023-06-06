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
    int  maxi = -999;
    public int maxPathSum(TreeNode root) {
        int maxPath = helper(root);
        return maxi;
        
    }
    
    public int helper(TreeNode root)
    {
        if(root==null)
            return 0;
        int lp = helper(root.left);
        int rp = helper(root.right);
        int maxi1 = Math.max(maxi,root.val + lp + rp);
        int maxi2 = Math.max(maxi1,root.val + Math.max(lp,rp));
        maxi = Math.max(root.val,maxi2);
        if(root.val>root.val+Math.max(lp,rp))
           return root.val;
        else  
            return root.val + Math.max(lp,rp);
    
        }
   
}
