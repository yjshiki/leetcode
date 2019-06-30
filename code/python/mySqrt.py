class Solution:
    def mySqrt(self, x: int) -> int:
        left = 0
        right = x
        while left < right:
            mid = (left + right)//2
            if mid*mid == x:
                return int(mid)
            elif mid*mid < x:
                if (mid+1)*(mid+1) > x:
                    return int(mid)
                elif (mid+1)*(mid+1) == x:
                    return int(mid+1)
                else:
                    left = mid
            else:
                right = mid
        
        return left
