class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for i in range(len(strs)):
            string = self.wordChange(strs[i])
            if string not in dic:
                dic[string] = [strs[i]]
            else:
                dic[string].append(strs[i])
        res = []
        for key in dic:
            res.append(dic[key])
        return res
               
    def wordChange(self,string:str) -> str:
        A = []
        for i in range(len(string)):
            A.append(string[i])
        A.sort()
        return ''.join(A)
