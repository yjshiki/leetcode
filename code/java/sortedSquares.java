class Solution {
    public int[] sortedSquares(int[] A) {
        if(A.length == 0)
            return A;
        int[] res = new int[A.length];
        int left=0,right=A.length-1;
        int sq1,sq2;
        for(int p=right;p>=0;p--){
            sq1 = A[left]*A[left];
            sq2 = A[right]*A[right];
            if(sq1>sq2){
                res[p] = sq1;
                left++;
            }
            else{
                res[p] = sq2;
                right--;
            }
        }
        return res;
    }
}
