class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        dis = abs(nums[0]+nums[1]+nums[2]-target)
        res = nums[0]+nums[1]+nums[2]
        for i in range(len(nums)-2):
            if i != 0 and nums[i]==nums[i-1]:
                continue
            j = i+1
            r = len(nums)-1
            while j < r:
                s = nums[i] + nums[j] + nums[r] - target
                if s < 0:
                    if dis > abs(s):
                        res = s + target
                        dis = abs(s)
                    j += 1
                    
                elif s > 0:
                    if dis > abs(s):
                        res = s + target
                        dis = s
                    r -= 1                  
                else:
                    return target
        return res
