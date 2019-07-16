class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        up = 0
        down = len(matrix)-1
        if down == -1:
            return False
        left = 0 
        right = len(matrix[0])
        if right == 0:
            return False
        
        while up < down:
            mid = (up+down)//2
            if matrix[mid][0] <= target and matrix[mid][-1] >= target:
                up = mid
                break
            elif matrix[mid][0] > target:
                down = mid - 1
            else:
                up = mid + 1

        if matrix[up][0] > target or matrix[up][-1] < target:
            return False
        elif matrix[up][0] == target or matrix[up][-1] == target:
            return True
        
        while left < right:
            mid = (left + right)//2
            if matrix[up][mid] == target:
                return True
            elif matrix[up][mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        
        return matrix[up][left] == target
