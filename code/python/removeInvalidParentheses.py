class Solution:
    def removeInvalidParentheses(self, s: str) -> List[str]:
        res = set()
        strings = set([s])
        if self.isValid(s) == True:
            return [s]
        while strings:
            temp = set()
            for string in strings:
                for i in range(len(string)):
                    if string[i] == "(" or string[i] == ")":
                        if i != len(string) - 1:
                            newString = string[0:i] + string[i+1:]
                        else:
                            newString = string[0:i]
                        if (self.isValid(newString)) == True:
                            res.add(newString)
                        else:
                            temp.add(newString)
            if res:
                return list(res)
            strings = temp
        
        return list(res)
    
    def isValid(self,String) -> bool:
        count = 0
        if String == "":
            return True
        for i in range(len(String)):
            if String[i] == '(':
                count += 1
            elif String[i] == ")":
                if count <= 0:
                    return False
                else:
                    count = count - 1
        return count == 0
                
            
        
