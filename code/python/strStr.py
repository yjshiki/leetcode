class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if len(haystack) < len(needle):
            return -1
        elif len(haystack) == len(needle):
            if haystack == needle:
                return 0
            else:
                return -1
        else:

            for i in range(0,len(haystack)-len(needle)+1):
                if needle == haystack[i:i+len(needle)]:
                    return i
            return -1
