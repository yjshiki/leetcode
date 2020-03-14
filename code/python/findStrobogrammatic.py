class Solution:
    def findStrobogrammatic(self, n: int) -> List[str]:
        if n==1:
            return ['0','1','8']
        if n==2:
            return ['11','69','88','96']
        
        if n % 2 != 0:
            b = self.findStrobogrammatic(n-1)
            res = []
            q = n//2 
            for a in b:
                res.append(a[:q]+'0'+a[q:])
                res.append(a[:q]+'1'+a[q:])
                res.append(a[:q]+'8'+a[q:])
            return res
        else:
            b = self.findStrobogrammatic(n-2)
            res = []
            q = n//2 -1
            for a in b:
                res.append(a[:q]+'00'+a[q:])
                res.append(a[:q]+'11'+a[q:])
                res.append(a[:q]+'69'+a[q:])
                res.append(a[:q]+'88'+a[q:])
                res.append(a[:q]+'96'+a[q:])
            return res       
