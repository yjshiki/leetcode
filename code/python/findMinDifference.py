class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        res = float("inf")
        for i in range(len(timePoints)):
            for j in range(i+1,len(timePoints)):
                res = min(res,self.calDifference(timePoints[i],timePoints[j]))
                if res == 0:
                    return 0
        return res
                
    
    def calDifference(self,s1,s2) -> int:
        l1 = s1.split(":")
        l2 = s2.split(":")
        res1 = abs( (int(l1[0]) - int(l2[0]))*60 + int(l1[1]) - int(l2[1]) )
        res2 = 24*60 - res1
        return min(res1,res2)
