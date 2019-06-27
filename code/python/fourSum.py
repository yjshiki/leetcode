class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            nums1 = nums.copy()
            popped = nums1.pop(i)
            t = target - popped
            for index in range(len(nums1)-2):
                if index != 0 and nums1[index]==nums1[index-1]:
                    continue
                j = index + 1
                r = len(nums1)-1
                while j < r:
                    s = nums1[index]+nums1[j]+nums1[r]
                    if s < t:
                        j += 1
                    elif s > t:
                        r -= 1
                    else:
                        temp = sorted([popped,nums1[index],nums1[j],nums1[r]])
                        if temp not in res:
                            res.append(temp)
                        while j < r and nums1[j] == nums1[j+1]:
                            j +=1
                        while j < r and nums1[r] == nums1[r-1]:
                            r -= 1
                        j = j +1
                        r = r -1
        return res
