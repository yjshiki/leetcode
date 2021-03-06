# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        res = []
        if root == None:
            return res
        nodes = [root]
        while nodes:
            vals = []
            temp = []
            for i in nodes:
                vals.append(i.val)
                if i.left != None:
                    temp.append(i.left)
                if i.right != None:
                    temp.append(i.right)
            res.append(vals[-1])
            nodes = temp
        return res
            
