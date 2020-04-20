class Solution {
    public int change(int amount, int[] coins) {
        if(amount == 0)
            return 1;
        int[] res = new int[amount+1];
        for(int c:coins)
            for(int i=0;i<amount+1;i++)
                if(i-c == 0)
                    res[i] += 1;
                else if(i-c > 0)
                    res[i] += res[i-c];
        return res[amount];
    }
}
