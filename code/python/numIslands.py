class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if grid == []:
            return 0
        height = len(grid)
        width = len(grid[0])
        count = 0
        for i in range(height):
            for j in range(width):
                if grid[i][j] == '1':
                    self.DFS(i,j,height,width,grid)
                    count += 1
                    
    
        return count
        
    def DFS(self,i:int,j:int,height:int,width:int,grid: List[List[str]]):
        if(i < 0 or i >= height or j<0 or j >= width or grid[i][j]=='0'):
            return
        grid[i][j] = '0'
        self.DFS(i-1,j,height,width,grid)
        self.DFS(i+1,j,height,width,grid)
        self.DFS(i,j+1,height,width,grid)
        self.DFS(i,j-1,height,width,grid)
