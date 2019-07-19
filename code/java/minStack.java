
class MinStack {

    /** initialize your data structure here. */
    Stack<Long> s;
    long min;
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int x) {
        if(s.isEmpty()){
            s.push(0L);
            min = x;
            
        }
        else{
            s.push(x-min);
            if(x<min)
                min = (long)x;
        }
        
    }
    
    public void pop() {
        long pop = s.pop();
        if(pop<0)
            min = min - pop;
    }
    
    public int top() {
        long top = s.peek();
        if(top > 0)
            return (int)(min + top);
        else
            return (int)min;
    }
    
    public int getMin() {
        return (int)min;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
