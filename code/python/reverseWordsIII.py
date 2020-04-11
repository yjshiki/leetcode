class Solution(object):
    def reverseWordsIII(self, s):
        """
        :type s: str
        :rtype: str
        """
        lst = s.split(" ")
        if len(lst) == 1:
            return s[::-1]
        res = ''
        for i in range(len(lst)):
            lst[i] = lst[i][::-1].strip()

            if lst[i].strip() != "":
                res = res + lst[i] + " "
        return res[:-1]
        
