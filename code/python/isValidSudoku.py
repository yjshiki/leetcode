class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        col = [set([]) for i in range(0,9)]
        row = [set([]) for i in range(0,9)]
        temp = [set([]) for i in range(0,3)]
        A= []
        temp1 = [set([]) for i in range(0,3)]
        temp2 = [set([]) for i in range(0,3)]
        A.append(temp1)
        A.append(temp2)
        A.append(temp)
        
        for i in range(0,9):
            for j in range(0,9):
                if board[i][j] == ".":
                    continue
                if board[i][j] < '1' or board[i][j] > '9':
                    
                    return False
                if board[i][j] not in col[i] and board[i][j] not in row[j]:
                    col[i].add(board[i][j])
                    row[j].add(board[i][j])
                    
                else:               
                    return False
                if board[i][j] not in A[(i//3)][j//3]:
                    A[(i//3)][(j//3)].add(board[i][j])

                else:                  
                    return False
        return True
