class Solution:
    def removeDuplicatesII(self, nums: List[int]) -> int:
    '''The function name was changed to avoid duplicate in file names'''
        index = 1
        length = len(nums)
        if length <= 1:
            return length
        
        while index < length-1:
            if nums[index] == nums[index-1] and nums[index] == nums[index+1]:
                nums.pop(index)
                length -= 1
            else:
                index += 1
        return length
