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
    public boolean isValidBST(TreeNode root) {
        if((root == null) || ((root.left == null) && (root.right == null)))
            return true;
        List<Integer> lst = new ArrayList<Integer>();
        helper(root,lst);
        for(int i=0;i<lst.size()-1;i++){
            if(lst.get(i) >= lst.get(i+1))
                return false;
        }
        return true;
    }
    
    public void helper(TreeNode root,List lst){
        if(root.left == null && root.right == null){
            lst.add(root.val);
            return ;
        }
        if(root.left != null)
            helper(root.left,lst);
        lst.add(root.val);
        if(root.right != null)
            helper(root.right,lst);
        return ;
    }
}



