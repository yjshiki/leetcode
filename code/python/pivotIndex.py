class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return -1
        total = sum(nums)
        left = 0
        right = total 
        
        for i in range(len(nums)):
            if right == left + nums[i]:
                return i
            left += nums[i]
            right -= nums[i]
        return -1
