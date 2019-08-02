class Solution:
    def decodeString(self, s: str) -> str:
        res = ""
        stack1 = []
        stack2 = []
        number = 0
        string = ""
        i =  0
        while i < len(s):
            if(s[i]>='0' and s[i] <= '9'):
                number = 10*number + int(s[i])              
            elif(s[i] == '['):
                stack2.append('[')
                stack1.append(number)
                number = 0
            elif(s[i] == ']'): 
                while stack2[-1] != '[':
                    string = stack2.pop(-1) + string
                temp = stack1.pop(-1) * string
                stack2[-1] = temp
                string = ""
                
            else:
                stack2.append(s[i])
            i = i + 1
        
        if len(stack2) != 0:
            for i in range(len(stack2)):
                if stack2[i] != '[':
                    res = res + stack2[i]
        return res
                
                
