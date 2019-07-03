class Solution:
    def canJump(self, nums: List[int]) -> bool:
        i = -1
        reach = 0
        n = len(nums)
        while(i<n and i<reach): 
            i = i + 1
            if reach >= n-1:
                return True
            reach = max(i+nums[i],reach)
            

        return False
