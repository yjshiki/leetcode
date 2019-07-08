class Solution:
    def convertToTitle(self, n: int) -> str:
        s = ""
        flag = 0
        
        while n > 0:
            s = chr(ord('A')+(n-1)%26) + s
            n=(n-1)//26
            
        return s
