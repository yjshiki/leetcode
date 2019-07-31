class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic = {0:1}
        total = 0
        res = 0
        
        for i in range(len(nums)):
            total += nums[i]
            if (total - k) in dic:
                res += dic[total - k]
            if total in dic:
                dic[total] += 1
            else:
                dic[total] = 1
                
     
        return res
