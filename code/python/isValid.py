class Solution:
    def isValid(self, s: str) -> bool:
        lst = []
        for i in range(len(s)):
            if s[i] == '(':
                lst.append(')')
            elif s[i] == '{':
                lst.append('}')
            elif s[i] == '[':
                lst.append(']')
            elif (len(lst) == 0 or lst.pop() != s[i]):
                return False
        return len(lst) == 0
