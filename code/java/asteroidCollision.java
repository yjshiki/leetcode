class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i : asteroids)
            if(i>0)
                s.push(i);
            else{
                while((!s.empty()) && s.peek() + i < 0 && s.peek() > 0)
                    s.pop();
                if(s.empty() || s.peek() < 0)
                    s.push(i);
                if(s.peek() + i == 0)
                    s.pop();
            }
        int[] res = new int[s.size()];
        for(int j=s.size()-1;j>=0;j--)
            res[j] = s.pop();
        return res;
    }
}
