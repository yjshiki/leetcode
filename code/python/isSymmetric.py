# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if(root==None):
            return True
        elif(root.left == None and root.right==None):
            return True
        elif(root.left == None or root.right==None):
            return False
        else:
            return self.helper(root.left,root.right)
    
    def helper(self,left: TreeNode, right: TreeNode) -> bool:
        if left == None or right == None:
            return left == right
        else:
            if left.val == right.val:
                return (self.helper(left.left,right.right) and self.helper(left.right,right.left) )
            else:
                return False
        
