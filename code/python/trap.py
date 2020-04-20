class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if height == []:
            return 0
        res = 0
        h = 0
        l = [0 for i in range(len(height))]
        r = [0 for i in range(len(height))]
        l[0] = height[0]
        for i in range(1,len(height)):
            l[i] = max(l[i-1],height[i])
        r[-1] = height[-1]
        for i in range(2,len(height)+1):
            r[-i] = max(height[-i],r[-i+1])

        for i in range(len(height)):
            res += min(l[i],r[i])-height[i]

        return res
