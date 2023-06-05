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
    class element
    {
        int val;
    }
    public int diameterOfBinaryTree(TreeNode root) {
          
         element obj = new element();
         obj.val = 0;
         helper(root,obj);
         return obj.val;
        }
    
    public int helper(TreeNode root, element o)
    {
        if(root==null)
            return 0;
        int lh = helper(root.left,o);
        int rh = helper(root.right,o);
        o.val = Math.max(o.val,lh + rh);
        return 1 + Math.max(lh,rh);
    }
}