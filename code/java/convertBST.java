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
    public TreeNode convertBST(TreeNode root) {
        helper(root,0);
        return root;
    }


    public int helper(TreeNode root, int total){
        if(root == null)
            return total;
        root.val += helper(root.right,total);
        return helper(root.left,root.val);
    }
}
