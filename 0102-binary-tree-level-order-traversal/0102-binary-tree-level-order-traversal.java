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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out  = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(root.val);
        out.add(first);
        queue.offer(root);
        List<Integer> list = new ArrayList<>();
        int level = 0;
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if(level==0)
            {
               list = new ArrayList<>();
               level = out.get(out.size()-1).size();
            }
            if(node.left!=null)
            {
                list.add(node.left.val);
                queue.offer(node.left);
            }
            if(node.right!=null)
            {
                list.add(node.right.val);
                queue.offer(node.right);
            }
            level--;
            if(level==0 && !list.isEmpty())
                out.add(list);
            
        }
        
        return out;
        
    }
}