class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0)
            return 0;
        int height = grid.length;
        int width = grid[0].length;
        int count = 0;
        int res = 0;
        for(int i=0;i<height;i++)
            for(int j =0;j<width;j++)
                if(grid[i][j] == 1){                 
                    res = Math.max(res,DFS(i,j,height,width,grid));
                }
        return res;
    }
    
        
    public int DFS(int i,int j,int height,int width,int[][] grid){
        if(i<0 || i>=height || j < 0 || j >= width || grid[i][j] == 0)
            return 0;
        else{
            grid[i][j] = 0;
            return 1 + DFS(i-1,j,height,width,grid) + DFS(i+1,j,height,width,grid) + DFS(i,j+1,height,width,grid) + DFS(i,j-1,height,width,grid);
        }
    }
}
