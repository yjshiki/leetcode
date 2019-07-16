# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if root == None:
            return 0
        elif root.left == None and root.right == None:
            return 1
        elif root.left == None:
            return 1 + self.minDepth(root.right)
        elif root.right == None:
            return 1 + self.minDepth(root.left)
        else:
            return 1 + min(self.minDepth(root.right),self.minDepth(root.left))
        
