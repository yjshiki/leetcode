class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        Max = float('inf')
        dp = [0] + amount * [Max]
        i = 1
        
        while i <= amount:
            temp = []
            for c in coins:
                if i - c >= 0:
                    temp.append(dp[i-c] + 1) 
                else:
                    temp.append(Max)
            dp[i] = min(temp)
            i += 1
        
        if dp[amount] == Max:
            return -1
        else:
            return dp[amount]
        
