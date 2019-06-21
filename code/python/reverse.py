class Solution:
    def reverse(self, x: int) -> int:
        if x > -10 and x<10:
            return x
        elif x > 0:
            flag = 1
        else:
            flag = -1
            x = -x
        Max = pow(2,31) - 1
        Min = -pow(2,31)
        string = str(x)
        A = []
        for i in range(len(string)):
            A.append(string[len(string)-i-1])
        
        ones = int(A.pop(-1))
        tens = int(''.join(A))
 
        if flag == -1:
            if tens * 10 <= -Min - ones:
                return -(10*tens + ones)
            else:
                return 0
        
        if flag == 1:
            if tens * 10 <= Max - ones:
                return 10*tens + ones
            else:
                return 0
