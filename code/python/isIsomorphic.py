class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        if s == t:
            return True
        dict1 = {}
        dict2 = {}
        for i in range(len(s)):
            if s[i] not in dict1:
                dict1[s[i]] = [i]
            else:
                dict1[s[i]].append(i)
            if t[i] not in dict2:
                dict2[t[i]] = [i]
            else:
                dict2[t[i]].append(i)

        for i in range(len(s)):
            if dict1[s[i]] != dict2[t[i]]:
                return False
        
        return True
        
