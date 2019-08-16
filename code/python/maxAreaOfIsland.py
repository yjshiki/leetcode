class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if grid == []:
            return 0
        height = len(grid)
        width = len(grid[0])
        res = 0
        for i in range(height):
            for j in range(width):
                temp = self.DFS(i,j,height,width,grid)
                res = max(res,temp)
        return res
        
    def DFS(self,i:int,j:int,height:int,width:int,grid:List[List[int]]) -> int:
        if i<0 or i>=height or j < 0 or j >= width :
            return 0
        if grid[i][j] == 0:
            return 0
        else:
            grid[i][j] = 0
            return 1 + self.DFS(i-1,j,height,width,grid) +\
        self.DFS(i+1,j,height,width,grid) + \
        self.DFS(i,j+1,height,width,grid) + \
        self.DFS(i,j-1,height,width,grid) 
        
