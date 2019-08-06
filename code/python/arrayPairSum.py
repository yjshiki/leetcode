class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        for i in range(len(nums)//2):
            res += nums[2*i]
        return res
        
