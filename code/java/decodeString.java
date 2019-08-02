class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<String> stack2 = new Stack<String>();
        int number = 0;
        String string = "";
        int i =  0;
        while (i < s.length()){
            if(s.charAt(i)>='0' && s.charAt(i) <= '9'){
                number = 10*number + Character.getNumericValue(s.charAt(i)) ;        
            }
            else if(s.charAt(i) == '['){
                stack2.push("[");
                stack1.push(number);
                number = 0;
            }
            else if(s.charAt(i) == ']'){
                String temp = stack2.pop();
                while(!temp.equals("[")){
                    string = temp + string;
                    temp = stack2.pop();
                }
                int num = stack1.pop();
                temp = "";
                for(int q=0;q<num;q++)
                    temp = temp + string;
                stack2.push(temp);
                string = "";
            }
            else
                stack2.push(s.substring(i,i+1));
                      
            i = i + 1;
        }
        if(!stack2.isEmpty()){
            while(!stack2.isEmpty()){
                String rem = (String)stack2.pop();
                if(!rem.equals("["))
                    res = rem + res;
                    
            }
        }
        return res;
    }    
    
}
