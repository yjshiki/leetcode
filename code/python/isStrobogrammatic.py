class Solution:
    def isStrobogrammatic(self, num: str) -> bool:
        if(len(num) == 0):   
            return True
        head = 0
        tail = len(num)-1
        while head < tail:
            if(num[head] == '0'):
                if num[tail] != '0':
                    return False
            elif(num[head] == '1'):
                if num[tail] != '1':
                    return False
            elif(num[head] == '6'):
                if num[tail] != '9':
                    return False
            elif(num[head] == '8'):
                if num[tail] != '8':
                    return False
            elif(num[head] == '9'):
                if num[tail] != '6':
                    return False
            else:
                return False
            head += 1
            tail -= 1
        
        if head == tail:
            return num[head] in ['0','1','8']
        else:
            return True
        
