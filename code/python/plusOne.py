class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        flag = 0
        for i in range(len(digits)):
            index = len(digits) - 1 - i
            if i == 0:
                digits[index] += 1
            
            if i != 0 and flag == 1:
                digits[index] += 1
                flag = 0
            
            if digits[index] >= 10:
                flag = 1
                digits[index] -= 10

            
        if flag == 1:
            res = [1]
            res.extend(digits)
            return res
        else:
            return digits
