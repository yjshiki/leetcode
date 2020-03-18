# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        self.helper(root,0)
        return root
      
    
    def helper(self,root,total) -> None:
        if not root:
            return total
        
        root.val += self.helper(root.right,total)
        return self.helper(root.left,root.val)

            
        
