    def isValidBST(self, root: TreeNode) -> bool:
        if root == None or (root.left==None and root.right==None):
            return True
        lst = []
        self.go(root,lst)
        for i in range(len(lst)-1):
            if lst[i] >= lst[i+1]:
                return False
        return True
    
    def go(self,root:TreeNode,lst:list) -> None:
        if root.left == None and root.right == None:
            lst.append(root.val)
            return
        if root.left != None:
            self.go(root.left,lst)
        lst.append(root.val)
        if root.right != None:
            self.go(root.right,lst)
        return
