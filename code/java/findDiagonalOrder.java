class Solution {
    public int[] findDiagonalOrder(int[][] matrix) { 
        if (matrix.length == 0)
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];
        res[0] = matrix[0][0];
        int flag = 1;
        int count = 1;
        Stack<Integer> s = new Stack<Integer>();
        for(int z=1;z<m+n-1;z++){
            if(flag==1){
                for(int i= Math.max(0,z+1-n);i<Math.min(m,z+1);i++)
                    res[count++] = matrix[i][z-i];
            }
            else{
                for(int i= Math.max(0,z+1-n);i<Math.min(m,z+1);i++)
                    s.push(matrix[i][z-i]);
                while(s.isEmpty() == false)
                    res[count++] = s.pop();
            }
            flag = -flag;
        }
        
        return res;
    }
}

