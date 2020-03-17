class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        total = 0
        i = 0
        count = 1
        while i < len(flowerbed):
            if flowerbed[i] == 0:
                count += 1
            else:
                total += max((count-1)//2,0)
                count = 0

            i = i + 1
        if count != 0:
            total += count//2
        

        return total >= n
                
                        
        
