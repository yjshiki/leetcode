class Solution:
    def majorityElementII(self, nums: List[int]) -> List[int]:
        if len(nums) < 3:
            return list(set(nums))
        nums.sort()
        A = []
        i = 0
        while i < len(nums)-1:
            if nums[i] == nums[i+1]:
                j = i+1               
                while nums[j] == nums[j-1]:
                    if j == len(nums)-1:
                        j = j+1
                        break
                    j = j + 1
                if j - i > len(nums)/3:
                    A.append(nums[i])
                i = j
            else:
                i = i + 1
        return A
