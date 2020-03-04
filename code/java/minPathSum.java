class Solution {
    public int minPathSum(int[][] grid) {
        int[][] minPath = new int[grid.length][grid[0].length];
        minPath[0][0] = grid[0][0];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                int a,b;
                if(i==0 && j==0)
                    continue;
                if(i>0)
                    a = minPath[i-1][j];
                else
                    a = Integer.MAX_VALUE;
                if(j>0)
                    b = minPath[i][j-1];
                else
                    b = Integer.MAX_VALUE;
                minPath[i][j] = Math.min(a,b) + grid[i][j];
            }
        return minPath[grid.length-1][grid[0].length-1];
    }
    
}
