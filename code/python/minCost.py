class Solution(object):
    def minCost(self, costs):
        """
        :type costs: List[List[int]]
        :rtype: int
        """
        if len(costs) == 0:
            return 0
        res = [[0,0,0] for i in range(len(costs))]
        res[0] = costs[0]
        if len(costs) == 1:
            return min(res[0])
        
        for i in range(1,len(costs)):
            res[i][0] = costs[i][0] + min(res[i-1][1],res[i-1][2])
            res[i][1] = costs[i][1] + min(res[i-1][0],res[i-1][2])
            res[i][2] = costs[i][2] + min(res[i-1][1],res[i-1][0])
        return min(res[-1])
