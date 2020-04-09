class Solution(object):
    def reverseStr(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        if len(s) < k:
            return s[::-1]
        if len(s) >= k and len(s) < 2* k:
            tmp = s[:k]
            tmp = tmp[::-1]
            return tmp + s[k:]

        tmp = s[:k]
        tmp = tmp[::-1]
        return tmp + s[k:2*k] + self.reverseStr(s[2*k:],k)
            
        
