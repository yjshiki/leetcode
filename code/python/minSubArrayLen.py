class Solution:
    def minSubArrayLen(self, s: int, nums: List[int]) -> int:  
        if(len(nums) == 0 ):
            return 0
        i = 0 
        j = 0
        res = len(nums) + 1
        sum = 0
        while(j < len(nums)):
            sum += nums[j]
            j = j + 1
            while(sum >= s):
                res = min(res,j-i)
                sum -= nums[i]
                i = i + 1
        
        if res == len(nums) + 1:
            return 0
        
        return res
