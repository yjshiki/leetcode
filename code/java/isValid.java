class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char c;
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(c ==  '(')
                stack.push(')');
            else if(stack.isEmpty() || (Character)stack.pop() != c)
                return false;
            
        }  
        return stack.isEmpty();
    }
}
