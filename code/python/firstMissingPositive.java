class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums.sort()
        if len(nums) == 0:
            return 1
        index = 0
        while index < len(nums):
            if(nums[index] == 1):
                break;
            else:
                index += 1
        if index == len(nums):
            if nums[index-1] != 1:
                return 1
            else:
                return 2
        
        for i in range(index,len(nums)-1):
            if nums[i+1]-nums[i] > 1 :
                return (nums[i] + 1)
        return (nums[-1] + 1)
