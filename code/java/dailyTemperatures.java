class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        int tmp;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<T.length;i++){
            while((!stack.isEmpty()) && (T[stack.peek()] < T[i])){
                tmp = stack.pop();
                res[tmp] = i - tmp;
            }
            stack.push(i);
        }
        return res;
    }
}
