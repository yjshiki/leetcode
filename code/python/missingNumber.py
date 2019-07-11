class Solution:
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums == [0]:
            return 1
        elif nums == [1]:
            return 0
        nums = list(set(nums))
        for i in range(len(nums)):
            if nums[i] != i:
                return i
        return i+1   
