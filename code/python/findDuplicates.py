class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        res = [-1 for i in range(len(nums))]
        for i in range(len(nums)):
            res[(nums[i]-1)] += 1
        for i in range(len(res)):
            if res[i] > 0:
                res[i] = i + 1
        index = 0
        while index < len(res):
            if res[index] <= 0:
                res.pop(index)
            else:
                index += 1
        return res
