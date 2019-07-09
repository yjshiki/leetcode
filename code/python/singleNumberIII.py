class Solution:
    def singleNumberIII(self, nums: List[int]) -> List[int]:
        if len(nums) == 2:
            return nums     
        nums.sort()
        i = 0
        while i < len(nums)-1:
            if nums[i] == nums[i+1]:
                nums.pop(i)
                nums.pop(i)
            else:
                i = i + 1
        return nums
