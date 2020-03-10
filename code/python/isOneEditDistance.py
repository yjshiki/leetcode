class Solution:
    def isOneEditDistance(self, s: str, t: str) -> bool:
        if s==t:
            return False
        len1 = len(s)
        len2 = len(t)
        if abs(len1-len2) > 1:
            return False;
        if len1 > len2:
            return self.isOneEditDistance(t,s)

        for i in range(len1):
            if s[i] != t[i]:
                if len1 == len2:
                    s = s[:i] + t[i] + s[i+1:]
                else:
                    s = s[:i] + t[i] + s[i:]
                break

        return s == t or s==t[:-1]
        
