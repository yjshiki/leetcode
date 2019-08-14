# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        if root == None:
            return []
        res = []
        vals = []
        nodes = [root]
        count = 0
        while nodes:
            temp = []
            for node in nodes:
                vals.append(node.val)
                if node.left != None:
                    temp.append(node.left)
                if node.right !=None:
                    temp.append(node.right)
            if count %2 == 1:
                vals.reverse()
            res.append(vals)
            vals = []
            nodes = temp
            count += 1
            
            
        return res
            
        
