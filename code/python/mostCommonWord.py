class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        lowStr = paragraph.lower()
        dic = {}
        i = 0
        while i < len(lowStr):
            if lowStr[i] >= 'a' and lowStr[i] <= 'z':
                j = i
                while j < len(lowStr):
                    if lowStr[j] < 'a' or lowStr[j] > 'z':
                        break
                    else:
                        j = j + 1
                temp = lowStr[i:j]
                if temp not in banned:
                    if temp not in dic:
                        dic[temp] = 1
                    else:
                        dic[temp] += 1
                i = j + 1
            else:
                i = i + 1

        num = 0
        res = ""
        for key in dic:
            if dic[key] > num:
                res = key
                num = dic[key]
                
        
        return res
        
