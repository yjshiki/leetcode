class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        if len(nums) == 1:
            return nums[0]
        res = nums[0]
        count = 1
        temp = 1
        
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                temp += 1
            else:
                if count < temp:
                    count = temp
                    res = nums[i-1]
                temp = 1
        
        if count < temp:
            res = nums[-1]
        return res
