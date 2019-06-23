class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        temp = 0
        z = x
        while x > 0:
            y = x%10;
            temp = temp*10 + y;
            x = x//10;

        if temp == z:
            return True
        else:
            return False
