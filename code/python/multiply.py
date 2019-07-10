class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        leni = len(num1)
        lenj = len(num2)
        res = 0
        for i in range(leni):
            for j in range(lenj):
                res += pow(10,leni - 1 - i + lenj - 1 - j) * int(num1[i]) * int(num2[j])

        return str(res)
