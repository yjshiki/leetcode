class Solution {
    public boolean searchMatrixII(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        if(matrix[0].length == 0)
            return false;
        int len = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(target >=matrix[i][0] && target <= matrix[i][len-1]){
                for(int j=0;j<len;j++)
                    if(matrix[i][j] == target)
                        return true;
                    else if(matrix[i][j] > target)
                        break;
            }
            if(target < matrix[i][0])
                return false;
        
        }       
        return false;
    }
}
