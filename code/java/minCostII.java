class Solution {
    public int minCostII(int[][] costs) {
        if(costs.length == 0)
            return 0;
        int k = costs[0].length;
        int[][] res = new int[costs.length][k];
        for(int i=0;i<k;i++)
            res[0][i] = costs[0][i];
        
        for(int i=1;i<costs.length;i++){
            for(int j=0;j<k;j++)
                res[i][j] = costs[i][j] + helper(res,i-1,j,k);
        }
        
        int result = Integer.MAX_VALUE;
        for(int m=0;m<k;m++){
            result = Math.min(result,res[res.length-1][m]);
        }
        return result;
    }
    
    public int helper(int[][] res, int i, int j, int k){
        int tmp = Integer.MAX_VALUE;
        for(int m=0;m<k;m++){
            if(m != j)
                tmp = Math.min(tmp,res[i][m]);
        }
        return tmp;
    }
    
}
