class Solution:
    def nthUglyNumber(self, n: int) -> int:
        ugly = [1 for i in range(n)]
        index = 1
        f2 = 2
        f3 = 3
        f5 = 5
        index2  = index3 = index5 = 0
        while index < n:
            f = min(min(f2,f3),f5)          
            ugly[index] = f 
            index += 1               
            if f == f2:
                index2 += 1
                f2 = 2*ugly[index2]
            if f == f3:
                index3 += 1
                f3 = 3*ugly[index3]
            if f == f5:
                index5 += 1
                f5 = 5*ugly[index5]
        
        return ugly[n-1]
            
