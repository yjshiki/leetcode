class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int up = 0, down = matrix.length - 1;
        int row = matrix[0].length - 1;
        int mid;
        if(target < matrix[0][0] || target > matrix[down][row])
            return false;
        while(up < down){
            mid = (up+down)/2;
            if(matrix[mid][0] <= target && matrix[mid][row] >= target){
                up = mid;
                break;
            }
            else if(matrix[mid][0] > target)
                down = mid-1;
            else if(matrix[mid][row] < target)
                up = mid + 1;
        }
        
        if(matrix[up][0] > target || matrix[up][row] < target)
            return false;
        else if(matrix[up][0] == target || matrix[up][row] == target)
            return true;
        
        int left = 0, right = row+1;
        while(left < right){
            mid = (left + right)/2;
            if(matrix[up][mid] == target)
                return true;
            else if(matrix[up][mid] > target )
                right = mid - 1;
            else
                left = mid + 1;          
        }

        return matrix[up][left] == target;
    }
}
