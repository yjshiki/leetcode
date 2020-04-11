class Solution(object):
    def minCostII(self, costs):
        """
        :type costs: List[List[int]]
        :rtype: int
        """
        if len(costs) == 0:
            return 0
        k = len(costs[0])
        res = [[0 for j in range(k)] for i in range(len(costs))]
        res[0] = costs[0]
        if len(costs) == 1:
            return min(res[0])
        
        for i in range(1,len(costs)):
            for j in range(k):
                res[i][j] = costs[i][j] + self.helper(res,i-1,j)
        return min(res[-1])
    
    def helper(self,res,i,j):
        tmp = float('inf')
        for m in range(len(res[i])):
            if m != j:
                tmp = min(tmp,res[i][m])
        return tmp
