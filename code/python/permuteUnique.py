class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0:
            return []
        if len(nums) == 1:
            return [nums]
        lst = [[nums[0]]]
        newlst = []
        for i in range(1,len(nums)):
            for j in range(len(lst)):
                temp = self.insert(lst[j],nums[i])
                newlst.extend(temp)
            lst = newlst
            newlst = []
        for i in lst:
            if i not in newlst:
                newlst.append(i)
        return newlst
    
    def insert(self,lst:List[int],num:int) -> List[List[int]]:
        A = []
        B = [num]
        C = []
        for i in range(len(lst)):
            C.extend(lst[0:i])
            C.extend(B)
            C.extend(lst[i:len(lst)])
            A.append(C.copy())
            C = []
        lst.extend(B)
        A.append(lst)
        return A
