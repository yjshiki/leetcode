class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend > 0 and divisor < 0:
            flag = -1
            divisor = -divisor
        elif dividend < 0 and divisor < 0:
            flag = 1
            dividend = -dividend
            divisor = -divisor        
        elif dividend > 0 and divisor > 0:
            flag = 1
        elif dividend < 0 and divisor > 0:
            flag = -1
            dividend = -dividend
        elif dividend == 0:
            return 0

        
        lst2 = []
        lst3 = []
        result = 0
        if dividend < divisor:
            return 0
        index = 1
        while dividend >= divisor:
            lst2.append(index)
            lst3.append(divisor)
            divisor = divisor + divisor
            index = index + index
        for i in range(len(lst2)):
            j = len(lst2)-1-i
            while dividend >= lst3[j]:
                result += lst2[j]
                dividend = dividend - lst3[j]
            
        result = result * flag
        if result >= -pow(2,31) and result <= pow(2,31)-1:
            return result
        else:
            return pow(2,31)-1
