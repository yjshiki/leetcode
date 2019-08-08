class Solution {
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        int res = 0, i = 0, j = 0, signal = 1, num = 0 ;
        while(i < s.length()){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                j = i;
                while(s.charAt(j) >= '0' && s.charAt(j) <= '9'){
                    num = 10 * num + Character.getNumericValue(s.charAt(j));
                    j++;
                    if(j == s.length())
                        break;
                }
                i = j;
                continue;
            }
            else if(s.charAt(i) == '+'){
                res += signal * num;
                num = 0;
                signal = 1;
            }
            else if(s.charAt(i) == '-'){
                res += signal * num;
                num = 0;
                signal = -1;
            }
            else if(s.charAt(i) == '('){
                nums.push(res);
                nums.push(signal);
                res = 0;
                signal = 1;
            }
            else if(s.charAt(i) == ')'){
                res += num * signal;
                signal = nums.pop();
                num = nums.pop();
                res = num + signal * res;
                num = 0;
                signal = 1;
            }
            
            i++;
        }
        
        if(num != 0)
            res += num* signal;
        
        return res;
    }

}
