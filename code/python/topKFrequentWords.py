class Solution:
    def topKFrequentWords(self, words: List[str], k: int) -> List[str]:
        words.sort()
        dic1 = {}
        dic2 = {}
        i = 0
        Max = 0
        while i < len(words):
            if words[i] not in dic1:
                dic1[words[i]] = 1
            else:
                dic1[words[i]] += 1
            i = i + 1
          
        for key in dic1:
            if dic1[key] not in dic2:
                dic2[dic1[key]] = [key]
            else:
                dic2[dic1[key]].append(key) 
            if Max < dic1[key]:
                Max = dic1[key]
        res = []
        while Max > 0:
            if Max in dic2:
                res.extend(dic2[Max])
            if len(res) >=k:
                return res[:k]
            Max -= 1
        
        return res[:k]
                
