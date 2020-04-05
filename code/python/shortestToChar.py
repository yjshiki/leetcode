class Solution(object):
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        res = [10001 for i in range(len(S))]
        tmp = []
        for i in range(len(S)):
            if S[i] == C:
                tmp.append(i)
        
        pre = -10000
        fore = tmp[0]
        j = 1
        i = 0
        while i < len(S):
            if i <= fore:
                res[i] = min(i-pre,fore-i)
                i = i + 1
            else:
                pre = fore
                if j < len(tmp):
                    fore = tmp[j]
                else:
                    fore = 20000
                j = j + 1
        return res
                
