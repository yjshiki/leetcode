# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSubtree(self, s, t):
        """
        :type s: TreeNode
        :type t: TreeNode
        :rtype: bool
        """
        if t == None:
            return True
        if s == None:
            return False
        
        if self.helper(s,t) != True:
            return self.isSubtree(s.left,t) or self.isSubtree(s.right,t)
        return True
    
    def helper(self,s,t):
        if s == None and t == None:
            return True
        if s == None or t == None:
            return False
        if s.val != t.val:
            return False
        return self.helper(s.left,t.left) and self.helper(s.right,t.right)
