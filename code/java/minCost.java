class Solution {
    public int minCost(int[][] costs) {
        if(costs.length == 0)
            return 0;
        int[][] res = new int[costs.length][3];
        res[0][0] = costs[0][0];
        res[0][1] = costs[0][1];
        res[0][2] = costs[0][2];
        
        for(int i=1;i<costs.length;i++){
            res[i][0] = costs[i][0] + Math.min(res[i-1][1],res[i-1][2]);
            res[i][1] = costs[i][1] + Math.min(res[i-1][0],res[i-1][2]);
            res[i][2] = costs[i][2] + Math.min(res[i-1][1],res[i-1][0]);
        }
        
        return Math.min(res[res.length-1][0],Math.min(res[res.length-1][2],res[res.length-1][1]));
    }
}
