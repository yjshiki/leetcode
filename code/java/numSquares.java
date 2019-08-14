class Solution {
    public int numSquares(int n) {
        int min = n + 10;
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<n+1;i++)
            dp[i] = min;
        for(int i=1;i<n+1;i++){
            int j = 1;
            min = n + 10;
            while(j*j<=i){
                min = Math.min(min,dp[i-j*j]+1);
                j = j + 1;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
