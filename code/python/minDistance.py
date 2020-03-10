class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        len1 = len(word1)
        len2 = len(word2)
        if len1 == 0:
            return len2
        if len2 == 0:
            return len1
        length = max(len1,len2)
        d = [ [0 for i in range(length+1)] for j in range(length+1) ]
        for i in range(len1+1):
            d[i][0] = i
        for j in range(len2+1):
            d[0][j] = j
        
        for i in range(1,len1+1):
            for j in range(1,len2+1):
                temp = d[i-1][j-1]
                if word1[i-1] == word2[j-1]:
                    temp -= 1
                d[i][j] = 1 + min(d[i-1][j],d[i][j-1],temp)
                
        return d[len1][len2]
