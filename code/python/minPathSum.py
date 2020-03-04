class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        minPath = []
        temp = []
        for i in range(len(grid[0])):
            temp.append(float('inf'))
        for i in range(len(grid)):
            minPath.append(temp)
        minPath[0][0] = grid[0][0]
        for i in range(len(minPath)):
            for j in range(len(minPath[0])):
                if i + j == 0:
                    continue
                if i > 0:
                    a = minPath[i-1][j]
                else:
                    a = float('inf')
                if j > 0:
                    b = minPath[i][j-1]
                else:
                    b = float('inf')
                minPath[i][j] = min(a,b) + grid[i][j]
        return minPath[-1][-1]
