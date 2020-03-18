class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        res = [0 for i in range(len(T))]
        stack = []
        for i in range(len(T)):
            while (stack) and T[stack[-1]] < T[i]:
                prev_index = stack.pop(-1)
                res[prev_index] = i - prev_index
            stack.append(i)

        return res
