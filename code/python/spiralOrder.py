class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == []:
            return []
        left_bound = 0
        right_bound = len(matrix[0])
        down_bound = len(matrix)
        up_bound = 0
        res = []
        i = j = 0
        while True:
            #right            
            while j < right_bound:
                res.append(matrix[i][j])
                j = j + 1
            up_bound += 1
            if i == down_bound-1:
                return res
            
            #down
            j = j - 1
            i = i + 1
            while i < down_bound:
                res.append(matrix[i][j])
                i = i + 1
            right_bound -= 1
            if j == left_bound:
                return res
            
            #left
            i = i - 1
            j = j - 1
            while j >= left_bound:
                res.append(matrix[i][j])
                j -= 1
            down_bound -= 1
            j = j + 1
            if i == up_bound:
                return res
            
            #up
            i = i - 1
            while i >= up_bound:
                res.append(matrix[i][j])
                i = i - 1
            left_bound += 1
            if j == right_bound-1:
                return res
            i = i + 1
            j = j + 1
