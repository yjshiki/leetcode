class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        dic1 = {}
        dic2 = {}
        words = str.split(" ")
        if len(pattern) != len(words):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in dic1:
                dic1[pattern[i]] = words[i]
            else:
                if dic1[pattern[i]] != words[i]:
                    return False
            if words[i] not in dic2:
                dic2[words[i]] = pattern[i]
            else:
                if dic2[words[i]] != pattern[i]:
                    return False        
        return True
        
