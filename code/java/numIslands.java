class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        int height = grid.length;
        int width = grid[0].length;
        int count = 0;
        for(int i=0;i<height;i++)
            for(int j =0;j<width;j++)
                if(grid[i][j] == '1'){
                    DFS(i,j,height,width,grid);
                    count += 1;
                }
        return count;
    }
        
    public void DFS(int i,int j,int height,int width,char[][] grid){
        if(i < 0 || i >= height || j<0 || j >= width || grid[i][j]=='0')
            return;
        grid[i][j] = '0';
        DFS(i-1,j,height,width,grid);
        DFS(i+1,j,height,width,grid);
        DFS(i,j+1,height,width,grid);
        DFS(i,j-1,height,width,grid);
    }
}
