class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) == 0:
            return []

        z = 1
        bound = len(matrix) + len(matrix[0]) - 1
        res = [matrix[0][0]]
        flag = 1
        # m, n, r = len(matrix), len(matrix[0]), []
        # for l in range(m + n - 1):
        #     temp = [matrix[i][l - i] for i in range(max(0, l+1 - n), min(l+1, m))]
        #     r += temp if l % 2 else temp[::-1]
        # return r
        while z < bound:
            if flag == 1:
                i = max(0,z+1-len(matrix[0]))
                while i < min(len(matrix),z+1):
                    res.append(matrix[i][z-i])       
                    i = i + 1
            else:
                t0 = []
                i = max(0,z+1-len(matrix[0]))
                while i < min(len(matrix),z+1):
                    t0.append(matrix[i][z-i])       
                    i = i + 1
                res.extend(t0[::-1])
            flag = -flag
            z += 1
        
        return res
