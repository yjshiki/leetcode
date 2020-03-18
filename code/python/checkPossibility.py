class Solution:
    def checkPossibility(self, nums: List[int]) -> bool:
        if len(nums) <= 2:
            return True
        for i in range(len(nums)-1):
            if nums[i] > nums[i+1]:
                return self.helper(nums,i,i+1) or self.helper(nums,i+1,i)
        return True
    
    def helper(self,nums,k,j)->bool:
        temp = nums[j]
        nums[j] = nums[k]
        for i in range(len(nums)-1):
            if nums[i] > nums[i+1]:
                nums[j] = temp
                return False
        return True
                
            
