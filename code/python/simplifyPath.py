class Solution:
    def simplifyPath(self, path: str) -> str:
        if(len(path) == 0):
            return "" 
        lst = path.split("/")
        res = []
        for i in range(len(lst)):
            if(lst[i] == ".." and res != []):
                res.pop(-1)
            else:
                if('.' != lst[i]) and ('..' != lst[i]) and ("" != lst[i]):
                    res.append(lst[i])
        s = ""
        
        for j in range(len(res)):
            s = s + "/" + res[j]
        if s == "":
            return "/"
        return  s
