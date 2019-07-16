class Solution:
    def reverseWords(self, s: str) -> str:
        lst = s.split(" ")
        print(lst)
        res = ""
        for string in lst:
            if string.strip() != "":
                res = string + " " + res
        res = res.strip()
        return res
