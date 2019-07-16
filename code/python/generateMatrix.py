class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        upBound = leftBound = -1
        rightBound = downBound = n
        A = [0 for i in range(n)]
        res = [A.copy() for i in range(n)]
        val = 1
        i = j = 0
        while val <= n*n:
            #go right
            while j < rightBound:
                res[i][j] = val
                j = j + 1
                val = val + 1
            j = j - 1
            i = i + 1
            upBound = upBound + 1
            
            #go down
            while i < downBound:
                res[i][j] = val
                i = i + 1
                val = val + 1
            i = i - 1
            j = j - 1
            rightBound = rightBound - 1
            
            #go left
            while j > leftBound:
                res[i][j] = val
                j = j - 1
                val = val + 1
            i = i - 1
            j = j + 1
            downBound = downBound - 1
            
            #go up
            while i > upBound:
                res[i][j] = val
                i = i - 1
                val = val + 1
            i = i + 1
            j = j + 1
            leftBound = leftBound + 1
            
            
        return res
        
