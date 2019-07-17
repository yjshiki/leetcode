class Solution:
    def searchMatrixII(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix) == 0:
            return False
        if len(matrix[0])  == 0:
            return False
        for i in range(len(matrix)):
            if(target >= matrix[i][0] and target <= matrix[i][-1]):
                if target in matrix[i]:
                    return True
            if target < matrix[i][0]:
                return False
        return False
