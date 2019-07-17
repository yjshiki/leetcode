class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(len(nums)):
            res.append(1)
        for i in range(1,len(nums)):
            res[i] *= (res[i-1]*nums[i-1])
 
        temp = 1
        for i in range(0,len(nums)):
            res[len(nums)-i-1] *= temp
            temp *= nums[len(nums)-1-i]
            
        return res
