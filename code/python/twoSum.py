class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        nums2 = nums.copy()
        nums2.sort()
        start = 0
        end = len(nums2) - 1
        A = []
        while True:
            if nums2[start] + nums2[end] > target:
                end -= 1
            elif nums2[start] + nums2[end] < target:
                start += 1
            else:
                if nums2[start] == nums2[end]:
                    i = nums.index(nums2[start])
                    A.append(i)
                    nums.pop(i)
                    j = nums.index(nums2[end])
                    A.append(j+1)
                    return A
                else:
                    i = nums.index(nums2[start])
                    A.append(i)
                    j = nums.index(nums2[end])
                    A.append(j)
                    return A
