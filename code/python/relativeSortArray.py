class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: List[int]
        """
        tmp1 = []
        tmp2 = []
        for m in arr1:
            if m not in arr2:
                tmp2.append(m)
            else:
                tmp1.append(m)
        res = sorted(tmp1,key = lambda x: arr2.index(x))
        res.extend(sorted(tmp2))
        return res
        
