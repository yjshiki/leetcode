class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        temp = set()
        res = set()
        for i in range(len(s)-9):
            sub = s[i:i+10]
            if sub in temp:
                res.add(sub)
            else:
                temp.add(sub)
        return list(res)
