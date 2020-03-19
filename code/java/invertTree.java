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
    public TreeNode invertTree(TreeNode root) {
        TreeNode p = root;
        TreeNode q;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while((stack != null) || (root != null)){
            if(root != null){
                stack.push(root);
                root = root.left;
            }
            else{
                if(stack.isEmpty() == true)
                    break;
                root = stack.pop();
                q = root.left;
                root.left = root.right;
                root.right = q;
                root = root.left;
            }
        }
        return p;
    }
}
