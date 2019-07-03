class Solution:
    def myAtoi(self, str: str) -> int:
        lst = str.strip().split()
        if(len(lst) == 0):
            return 0
        flag = 0

        temp = lst[0]
        end = len(temp)

        for i in range(len(temp)):
            if flag == 0 and temp[i] >= "0" and temp[i] <= "9":
                flag = 1
                continue
            if flag == 1 and (temp[i] < "0" or temp[i] > "9"):
                end = i  
                flag = 2
                break

        try:
            num = int(temp[0:end])

            if num < 0:
                return max(num,-2147483648)
            elif num > 0:
                return min(num,2147483647)
            else:
                return 0
        except:
            return 0
