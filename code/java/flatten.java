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
    public void flatten(TreeNode root) {
        if(root == null || (root.left==null && root.right == null) )
            return;
        List<TreeNode> temp = new ArrayList<TreeNode>();
        store(root,temp);
        root.left = null;
        for(int i=1;i<temp.size();i++){
            root.left = null;
            root.right = temp.get(i);
            root = root.right;
        }
    }

    
    public void store(TreeNode root,List<TreeNode> temp){
        if(root == null)
            return;
        temp.add(root); 
        store(root.left,temp);
        store(root.right,temp);
    }
}
