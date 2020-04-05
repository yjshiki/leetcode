class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums == []:
            return 0
        res = [0 for i in range(len(nums))]
        res[0] = nums[0]
        if len(nums) >= 2:
            res[1] = max(nums[0],nums[1])
        else:
            return nums[0]
        
        for i in range(2,len(res)):
            res[i] = max(res[i-2] + nums[i],res[i-1])
        return res[-1]
            
        
        
