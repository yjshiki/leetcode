class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        n = len(nums)
        for i in range(pow(2,n)):
            s = self.binToString(bin(i),n)
            temp = []
            for j in range(n):
                if s[n-1-j] == "1":
                    temp.append(nums[j])
            res.append(temp)
        return res
    
    def binToString(self,num:bin,n:int) -> str:
        s = (str(num))[2:]
        length = len(s)
        for i in range(n-length):
            s = "0" + s;
        return s
