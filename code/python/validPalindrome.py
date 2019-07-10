class Solution:
    def validPalindrome(self, s: str) -> bool:
        if len(s) == 0:
            return True
        s = s.lower()
        s1 = ""
        s2 = ""
        for i in range(len(s)):
            if (s[i] >= 'a' and s[i] <= 'z') or (s[i] >= '0' and s[i] <= '9'):
                s1 = s[i] + s1
                s2 = s2 + s[i]
        return s1==s2
