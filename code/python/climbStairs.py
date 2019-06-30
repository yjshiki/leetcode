class Solution:
    def climbStairs(self, n: int) -> int:
        total = 0
        twos = 0
        num = n
        
        if n<=0:
            return 0
        
        if n<=3:
            return n
        
        
        while n >= 0:
            temp = 1
            for i in range(twos):
                temp *= (num-i)
            for i in range(twos):
                temp = temp//(twos-i)        
            total += temp   
            n = n - 2
            twos += 1
            num = n + twos
            
        return total
