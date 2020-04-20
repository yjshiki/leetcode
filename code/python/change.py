class Solution(object):
    def change(self, amount, coins):
        """
        :type amount: int
        :type coins: List[int]
        :rtype: int
        """
        if amount == 0:
            return 1
        res = [ 0 for i in range(amount+1)]
        for c in coins:
            for i in range(len(res)):
                if i - c == 0:
                    res[i] += 1
                elif i - c > 0:
                    res[i] += res[i-c]
        return res[-1]
