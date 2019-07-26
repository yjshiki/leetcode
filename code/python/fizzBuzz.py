class Solution:
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        L = []
        if n == 0:
            return []
        if n == 1:
            return ['1']
        for i in range(n):
            temp = i + 1
            if temp%15 == 0:
                L.append('FizzBuzz')
            elif temp%3 == 0:
                L.append('Fizz')
            elif temp%5 == 0:
                L.append('Buzz')
            else:
                j = str(temp)
                L.append(j)
        
        return L  
