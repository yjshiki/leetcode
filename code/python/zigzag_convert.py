class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if len(s) < numRows or numRows == 1:
            return s
        flag = 1
        index = 0
        A = []
        result = ""
        for i in range(numRows):
            A.append([])

        for i in range(len(s)):
            A[index].append(s[i])
            if index == 0:
                flag = 1
            elif index == numRows-1:
                flag = -1
            
            if flag == 1:
                index += 1
            elif flag == -1:
                index -= 1
       
        for i in range(numRows):
            temp = ''.join(A[i])
            result += temp
        
        return result
