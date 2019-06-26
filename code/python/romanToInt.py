class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dic = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }
        total = 0;
        for i in range(1,len(s)):
            prev = dic[s[i-1]];
            curr = dic[s[i]];
            if prev < curr:
                total -= prev
            else:
                total += prev
        return total+dic[s[-1]]
