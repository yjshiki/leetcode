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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        findPath(root,sum,temp,res);
        return res;
    }
    
    public void findPath(TreeNode root, int sum, List<Integer> temp,List<List<Integer>> res){
        if(root != null){
            temp.add(root.val);
            if(root.left == null && root.right == null){
                if(root.val == sum){
                    List<Integer> temp2 = new ArrayList<Integer>();
                    for(int i=0;i<temp.size();i++)
                        temp2.add(temp.get(i));
                    res.add(temp2);
                }
                temp.remove(temp.size()-1);
            }
            else{
                findPath(root.left,sum-root.val,temp,res);
                findPath(root.right,sum-root.val,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
}
