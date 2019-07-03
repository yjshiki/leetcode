class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        nums = [0]*(m+n)
        nums[0:m]=nums1[0:m]
        nums[m:m+n]=nums2[0:n]
        nums.sort()
        nums1[0:m+n]=nums[:]
