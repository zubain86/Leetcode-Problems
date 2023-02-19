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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pth = new LinkedList<>();
        Queue<TreeNode> qth = new LinkedList<>();
        pth.offer(p);
        qth.offer(q);
        while(!pth.isEmpty())
        {
            TreeNode strp = pth.poll();
            TreeNode strq = qth.poll();
            if((strp!=null && strq!=null && (strp.val!=strq.val)) || (strp==null && strq!=null) || (strp!=null && strq==null))
                return false;
            
                if(strp!=null)
                {
                pth.offer(strp.left);
                pth.offer(strp.right);
                }
                if(strq!=null)
                {
                qth.offer(strq.left);
                qth.offer(strq.right);
                }
        }
        
        return true;
        
    }
}