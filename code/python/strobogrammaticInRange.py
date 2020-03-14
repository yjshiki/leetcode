class Solution:
    def strobogrammaticInRange(self, low: str, high: str) -> int:
        l = len(low)
        h = len(high)
        if int(low) > int(high):
            return 0
        count=0
        temp = self.findStrobogrammatic(l)
        for num in temp:
            if int(num) >= int(low):
                count += 1
        for i in range(l+1,h):
            count += len(self.findStrobogrammatic(i))
        if l < h:
            temp = self.findStrobogrammatic(h)
            for num in temp:
                if int(num) <= int(high):
                    count += 1 
        else:
            for num in temp:
                if int(num) > int(high):
                    count -= 1 
                    
        return count
    
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
