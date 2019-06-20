class Solution:
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        'return nums.remove(val)'
        
        index=0
        i=0;

        for i in nums:
            if i!= val:
                nums[index]=i;
                index +=1;

        return index
