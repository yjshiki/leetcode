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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        int count = 0;
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(root);
        while(nodes.size() != 0){
            List<Integer> vals = new ArrayList<Integer>();
            List<TreeNode> temp = new ArrayList<TreeNode>();
            for(TreeNode node:nodes){
                vals.add(node.val);
                if(node.left != null)
                    temp.add(node.left);
                if(node.right != null)
                    temp.add(node.right);
            }
            if(count % 2 == 1){
                List<Integer> newVals = new ArrayList<Integer>();
                for(int i= vals.size()-1;i >=0;i--)
                    newVals.add(vals.get(i));
                res.add(newVals);
            }
            else
                res.add(vals);
            nodes = temp;
            count++;
        }

        return res;    
            
    }
}
