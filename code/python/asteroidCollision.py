class Solution(object):
    def asteroidCollision(self, asteroids):
        """
        :type asteroids: List[int]
        :rtype: List[int]
        """
        length = len(asteroids)
        temp = 1
        while temp != 0:
            asteroids = self.helper(asteroids)
            temp = len(asteroids)
            if temp == length:
                break
            else:
                length = temp
            
        return asteroids
    
    def helper(self,asteroids):
        if len(asteroids) < 2:
            return asteroids
        i = 0
        while i < len(asteroids):
            if asteroids[i] > 0:
                j = i + 1
                for j in range(i+1,len(asteroids)):
                    if asteroids[j] > 0:
                        break
                    if asteroids[i] + asteroids[j] > 0:
                        asteroids[j] = 0
                    elif asteroids[i] + asteroids[j] == 0:
                        asteroids[i] = 0
                        asteroids[j] = 0
                        break
                    else:
                        asteroids[i] = 0
                        break
                i = j + 1
            else:
                i = i + 1

        i = len(asteroids) - 1
        while i > 0:
            if asteroids[i] < 0:
                j = i -1
                while j > -1:
                    if asteroids[j] < 0:
                        break
                    if asteroids[j] == 0:
                        j = j - 1
                        continue
                    if asteroids[i] + asteroids[j] > 0:
                        asteroids[i] = 0
                        break
                    elif asteroids[i] + asteroids[j] == 0:
                        asteroids[i] = 0
                        asteroids[j] = 0
                        break
                    else:
                        asteroids[j] = 0
                        j = j - 1
                        break
                i = j
            else:
                i = i - 1
        
        i = 0
        while i < len(asteroids):
            if asteroids[i] == 0:
                asteroids.pop(i)
            else:
                i = i + 1
        return asteroids
                
        
