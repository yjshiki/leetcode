class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        dic = {
            2:['a','b','c'],
            3:['d','e','f'],
            4:['g','h','i'],
            5:['j','k','l'],
            6:['m','n','o'],
            7:['p','q','r','s'],
            8:['t','u','v'],
            9:['w','x','y','z']
        }
        
        if len(digits) == 0:
            return []
        if len(digits) == 1:
            return dic[int(digits)]
        
        A = []
        for i in range(1,len(digits)):
            cur = dic[int(digits[i])]
            if A == []:
                prev = dic[int(digits[i-1])]
            lenp = len(prev)
            lenc = len(cur)
            A = []
            for j in range(lenp):
                for k in range(lenc):
                    A.append(prev[j]+cur[k])
            
            prev = A
        
        return A
                
