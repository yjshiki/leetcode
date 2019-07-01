class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        small = min(m,n)
        large = max(m,n)
        res = 1
        
        for i in range(1,small):
            res *= (large + i - 1)
            res /= i
        
        res = int(res)
        return res
