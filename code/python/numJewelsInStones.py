class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        lst = []
        if J == "":
            return 0
        res = 0
        for i in range(len(J)):
            if J[i] not in lst:
                lst.append(J[i])
        for i in range(len(S)):
            if S[i] in lst:
                res += 1
        return res
