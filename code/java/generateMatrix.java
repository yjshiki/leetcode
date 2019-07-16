class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int upBound = -1,leftBound = -1, rightBound = n, downBound = n;
        int val = 1;
        int i=0,j=0;
        while(val<= n * n){
            //go right
            while(j < rightBound)
                res[i][j++] = val++;
            j--;
            upBound++;
            i++;
            //go down
            while(i < downBound)
                res[i++][j] = val++;
            i--;
            rightBound--;
            j--;            
            //go left
            while(j > leftBound)
                res[i][j--] = val++;
            j++;
            downBound--;
            i--;
            
            //go up
            while(i > upBound)
                res[i--][j] = val++;
            i++;
            leftBound++;
            j++;                
        }
        return res;
    }
}
