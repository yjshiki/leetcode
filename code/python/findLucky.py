class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        if len(arr) == 0:
            return -1
        dic = {}
        for i in range(len(arr)):
            if arr[i] in dic:
                dic[arr[i]] += 1
            else:
                dic[arr[i]] = 1
        res = -1
        for key in dic:
            if dic[key] == key:
                res = max(key,res)
        return res
