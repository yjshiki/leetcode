class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        if(queries.length == 0)
            return null;
        int[] res = new int[queries.length];
        A[queries[0][1]] += queries[0][0];
        for(int i=0;i<A.length;i++)
            if(A[i] % 2 == 0)
                res[0] += A[i];
        for(int i=1;i<queries.length;i++){
            int prev = A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            if(A[queries[i][1]]%2 == 0)
                if(prev % 2 == 0)
                    res[i] = res[i-1] + queries[i][0];
                else
                    res[i] = res[i-1] + A[queries[i][1]];
            else
                if(prev % 2 == 0)
                    res[i] = res[i-1] - prev;
                else
                    res[i] = res[i-1];
        }
        
        return res;
    }
}
