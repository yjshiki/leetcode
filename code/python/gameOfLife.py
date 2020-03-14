class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        for i in range(len(board)):
            for j in range(len(board[0])):
                count = 0
                l = 0
                r = 0
                if i < len(board)-1:
                    if board[i+1][j] == 1 or board[i+1][j] == 2:
                        count += 1
                    if j < len(board[0])-1:
                        if board[i][j+1] == 1 or board[i][j+1] == 2:
                            count += 1
                            r += 1
                        if board[i+1][j+1] == 1 or board[i+1][j+1] == 2:
                            count += 1
                    if j > 0:
                        if board[i][j-1] == 1 or board[i][j-1] == 2:
                            count += 1
                            l += 1
                        if board[i+1][j-1] == 1 or board[i+1][j-1] == 2:
                            count += 1   
                if i > 0:
                    if board[i-1][j] == 1 or board[i-1][j] == 2:
                        count += 1
                    if j < len(board[0])-1:
                        if board[i][j+1] == 1 or board[i][j+1] == 2:
                            count += 1
                            r += 1
                        if board[i-1][j+1] == 1 or board[i-1][j+1] == 2:
                            count += 1
                    if j > 0:
                        if board[i][j-1] == 1 or board[i][j-1] == 2:
                            count += 1
                            l += 1
                        if board[i-1][j-1] == 1 or board[i-1][j-1] == 2:
                            count += 1 
                if l == 2:
                    count -= 1
                if r== 2:
                    count -= 1
                if board[i][j] == 1:
                    if count < 2 or count > 3:
                        board[i][j] = 2
                else:
                    if count == 3:
                        board[i][j] = 3

        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == 2:
                    board[i][j] = 0
                elif board[i][j] == 3:
                    board[i][j] = 1
        
