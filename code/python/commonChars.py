class Solution:
    def commonChars(self, A: List[str]) -> List[str]:
        dic = {}
        lst = [0 for i in range(len(A))]
        for i in range(len(A[0])):
            if A[0][i] not in dic:
                dic[A[0][i]] = lst.copy()
                dic[A[0][i]][0] = 1
            else:
                dic[A[0][i]][0] += 1
        
        for i in range(1,len(A)):
            for j in range(len(A[i])):
                if A[i][j] in dic:
                    dic[A[i][j]][i] += 1
        res = []
        for key in dic:
            if min(dic[key]) != 0:
                for i in range(min(dic[key])):
                    res.append(key)
        
        return res
    
