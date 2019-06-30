class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        lst = s.strip().split(' ')
        
        if len(lst) == 0:
            return 0
        
        if len(lst) == 1:
            temp = lst[0]
            for i in range(len(temp)):
                if temp[i] <'a' and temp[i]>'z' and temp[i]<'A' and temp[i]>'Z':
                    return 0
            return len(temp)
        
        if len(lst) >= 2:
            for j in range(len(lst)):
                temp = lst[len(lst)-1-j]
                flag = 0
                for t in range(len(temp)):
                    if temp[t] <'a' and temp[t]>'z' and temp[t]<'A' and temp[t]>'Z':
                        flag = 1
                        break
                if flag == 0:
                    return len(temp)
            return 0
