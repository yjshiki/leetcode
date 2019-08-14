class Solution:
    def numSquares(self, n: int) -> int:
        if n <= 2:
            return n
        
        lst = []
        i = 1
        while i*i <=n:
            lst.append(i*i)
            i = i+1
            
        count = 0
        nums = set([n])
        while nums:
            count = count + 1
            temp = set()
            for x in nums:
                for y in lst:
                    if x == y:
                        return count
                    if x < y :
                        break
                    temp.add(x-y)
            nums = temp
            
            
        return count
