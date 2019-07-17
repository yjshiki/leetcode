class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if(len(nums) == 1):
            return nums[0]
        
        nums1 = nums.copy()
        nums1.reverse()
        res = nums[0]
        
        for i in range(1,len(nums)):
            if(nums[i-1]!=0):
                nums[i] *= nums[i-1]
            res = max(res,nums[i])
            
        res = max(nums1[0],res)
        for i in range(1,len(nums1)):
            if(nums1[i-1] != 0):
                nums1[i] *= nums1[i-1]
            res = max(res,nums1[i])
        return res
        
