# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def flatten(self, root: TreeNode) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        if root == None:
            return
        if root.left == None and root.right == None:
            return 
        temp = []
        self.store(root,temp)
        root.left = None

        for i in range(1,len(temp)):
            root.right = temp[i]
            root.left = None
            root = root.right

    
    def store(self,root:TreeNode,temp) -> None:
        if root == None:
            return
        temp.append(root)  
        self.store(root.left,temp)
        self.store(root.right,temp)
        return
