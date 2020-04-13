class Solution(object):
    def numPairsDivisibleBy60(self, time):
        """
        :type time: List[int]
        :rtype: int
        """
        arr = [0 for i in range(60)]
        for num in time:
            arr[num%60] += 1
            
        res = arr[0] * (arr[0]-1) // 2 + arr[30] * (arr[30]-1) // 2
        for i in range(1,30):
            res += arr[i] * arr[60-i]
        
        return res
