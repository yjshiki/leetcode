class Solution:
    def binarySearch(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums) - 1
        if nums == []:
            return -1
        
        while l < r:
            mid = (l+r)//2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                l = mid + 1
            else:
                r = mid
        if nums[l] == target:
            return l
        else:
            return -1
