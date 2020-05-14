class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if s == "":
            return True
        i = 0
        j = 0
        while j < len(t):
            if s[i] == t[j]:
                i = i + 1
            j = j + 1
            if i == len(s):
                return True
        return False
        
