class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        if word == "":
            return False
        for i in range(len(board)):
            for j in range(len(board[0])):
                if self.helper(board,i,j,word) == True:
                    return True
        return False
        
    def helper(self,board,i,j,word) -> bool:
        if len(word) == 0:
            return True
        if i<0 or i > len(board)-1 or j > len(board[0])-1 or j < 0 or word[0] != board[i][j]:
            return False
        tmp = board[i][j]
        board[i][j] = "#"
        res = self.helper(board,i-1,j,word[1:]) or self.helper(board,i+1,j,word[1:]) or \
            self.helper(board,i,j-1,word[1:]) or self.helper(board,i,j+1,word[1:])
        
        board[i][j] = tmp
        
        
        return res
