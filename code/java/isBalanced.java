/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root == null)
           return true;
       else
           if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1)
               return false;
           else
               return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            return 1;
        else
            return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
