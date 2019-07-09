class Solution:
    def titleToNumber(self, s: str) -> int:
        A = [pow(26,(len(s)-1-i)) for i in range(len(s))]
        count = 0
        
        for i in range(len(s)):
            count += A[i] * (ord(s[i]) - ord('A')+1)
        
        return count
