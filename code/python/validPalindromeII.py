class Solution:
    def validPalindromeII(self, s: str) -> bool:
        left = 0
        right = len(s)-1
        while left < right:
            if s[left] == s[right]:
                left += 1
                right -= 1
            else:
                return (self.helper(s[left:right]) or self.helper(s[left+1:right+1]))

        return True
    
    
    def helper(self,s:str) -> bool:
        le = 0
        ri = len(s) - 1
        while le < ri:
            if s[le] != s[ri]:
                return False
            else:
                le += 1
                ri -= 1
                
        return True
