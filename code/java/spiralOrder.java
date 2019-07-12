class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0)
            return res;
        int i=0,j=0;
        int leftBound=0, rightBound=matrix[0].length - 1, upBound=0, downBound = matrix.length - 1;
        while(true){
            //go right
            while(j <= rightBound)
                res.add(matrix[i][j++]);
            upBound++;
            if(i == downBound)
                return res;
            j--;
            i++;
            //go down
            while(i <= downBound)
                res.add(matrix[i++][j]);
            rightBound--;
            if(j == leftBound)
                return res;
            i--;
            j--;
            //go left
            while(j >= leftBound)
                res.add(matrix[i][j--]);
            downBound--;
            if(i == upBound)
                return res;
            j++;
            i--;
            //go up
            while(i >= upBound)
                res.add(matrix[i--][j]);
            leftBound++;
            if(j==rightBound)
                return res;
            i++;
            j++;
            
        }
    }
}
