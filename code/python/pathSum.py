# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> List[List[int]]:
        res = []
        self.findPath(root,sum,[],res)
        return res
    
    def findPath(self, root: TreeNode, sum: int,temp: List[int],res : List[List[int]]):
        if root != None:
            temp.append(root.val)
            if root.left == None and root.right == None:
                if root.val == sum:
                    res.append(temp.copy())
            else:
                self.findPath(root.left,sum-root.val,temp,res) 
                self.findPath(root.right,sum-root.val,temp,res)
            temp.pop(-1)
