class Solution:
    def addBinary(self, a: str, b: str) -> str:
        length = max(len(a),len(b))
        A = []
        for j in range(length):
            temp = 0
            if j < len(a):
                temp += int(a[len(a)-1-j])
            if j < len(b):
                temp += int(b[len(b)-1-j])
            A.append(temp)
            
            
        
        A.reverse()
        
        if len(A) == 1:
            if A[0] == 2:
                return '10'
            else:
                return str(A[0])
        
        for i in range(len(A)):
            index = len(A)-1-i            
            if A[index] >= 2:
                A[index] = str(A[index]-2)
                if index != 0:
                    A[index-1] += 1
                else:
                    res = ['1']
                    res.extend(A)
                    return "".join(res)
            A[index] = str(A[index])
      
        return("".join(A))
