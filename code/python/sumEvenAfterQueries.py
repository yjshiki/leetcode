class Solution:
    def sumEvenAfterQueries(self, A: List[int], queries: List[List[int]]) -> List[int]:
        if len(queries) == 0:
            return [];
        res = [0 for i in range(len(queries))]
        A[queries[0][1]] += queries[0][0]
        count = 0
        
        for i in range(len(A)):
            if A[i] % 2 == 0:
                count += A[i]
        res[0] = count

        for i in range(1,len(queries)):
            prev = A[queries[i][1]]
            A[queries[i][1]] += queries[i][0]
            if A[queries[i][1]] % 2 == 0 and prev % 2 == 0:
                count = count + queries[i][0]
            elif A[queries[i][1]] % 2 == 0 and prev % 2 != 0:
                count += A[queries[i][1]]
            elif A[queries[i][1]] % 2 != 0 and prev % 2 == 0:
                count -= prev
            res[i] = count

        return res
