public class Solution {
    public int coinChange(int[] coins, int amount) {
        int Max = 2 * amount + 10;
        int[] dp = new int[amount+1];
        for(int i=1;i<amount+1;i++)
            dp[i] = Max;
        
        int total = 1;
        while(total <= amount){
            List<Integer> temp = new ArrayList<Integer>();
            for(int c: coins)
                if(total - c >= 0)
                    temp.add(dp[total-c] + 1);
                else
                    temp.add(Max);
            for(int j=0;j<temp.size();j++)
                if(dp[total] > temp.get(j))
                    dp[total] = temp.get(j);
            total++;
        }
        
        if(dp[amount] == Max)
            return -1;
        else
            return dp[amount];
    }

}
