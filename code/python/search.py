class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if len(nums) == 0:
            return -1
        l = 0
        h = len(nums) - 1
        while l < h:
            mid = (l+h)//2
            if nums[mid] > nums[h]:
                l = mid + 1
            else:
                h = mid
        MIN = l

        
        if target <= nums[-1]:
            l = MIN
            h = len(nums)-1
            while l < h:
                mid = (l+h)//2
                if nums[mid] == target:
                    return mid
                elif nums[mid] < target:
                    l = mid + 1
                else:
                    h = mid 
            if nums[l] == target:
                return l
                    
        if target >= nums[0]:
            l = 0
            h = MIN
            while l < h:
                mid = (l+h)//2
                if nums[mid] == target:
                    return mid
                elif nums[mid] < target:
                    l = mid + 1
                else:
                    h = mid 
            if nums[l] == target:
                return l
        
        return -1
