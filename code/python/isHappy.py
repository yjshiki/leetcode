class Solution:
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """

        count = 0
        C = []
        
        while n!=0:
            temp = n%10
            count += temp*temp
            n = n//10
            if n == 0:
                if count == 1:
                    return True
                elif count in C:
                    return False
                n = count
                count = 0
                C.append(n)
                
