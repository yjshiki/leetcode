class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> cols = new HashSet();
        Set<Integer> rows = new HashSet();
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(!rows.contains(j))
                        rows.add(j);
                    if(!cols.contains(i))
                        cols.add(i);
                }
            }
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(rows.contains(j) || cols.contains(i))
                    matrix[i][j] = 0;
    }
}
