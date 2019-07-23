class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        res = []
        if len(A) == 0:
            return res
       
        if A[0] >=0:
            for i in range(len(A)):
                A[i] = A[i] * A[i]
            return A
        
        if A[-1] <= 0:
            for i in range(1,len(A)+1):
                res.append(A[-i] * A[-i])
            return res
        
        for i in range(len(A)-1):
            if A[i+1] >=0 and A[i] < 0:
                left = i
                right = i+1
        
        while left >-1 or right < len(A):
            if left != -1:
                nums1 = -A[left]
            else:
                nums1 = 10001
                
            if right != len(A):
                nums2 = A[right]
            else:
                nums2 = 10001
            if nums1==10001 and nums2 == 10001:
                return res
            else:
                if nums1 < nums2:
                    res.append(nums1*nums1)
                    left -= 1
                else:
                    res.append(nums2*nums2)
                    right += 1
        return res

        
            
        
        
        
