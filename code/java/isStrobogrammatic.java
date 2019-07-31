class Solution {
    public boolean isStrobogrammatic(String num) {
        if(num.length() == 0)   
            return true;
        int head = 0;
        int tail = num.length()-1;
        while(head < tail){
            if(num.charAt(head) == '0'){
                if( num.charAt(tail) != '0')
                    return false;
            }
            else if(num.charAt(head) == '1'){
                if( num.charAt(tail) != '1')
                    return false;
            }
            else if(num.charAt(head) == '6'){
                if( num.charAt(tail) != '9')
                    return false;
            }
            else if(num.charAt(head) == '8'){
                if( num.charAt(tail) != '8')
                    return false;
            }
            else if(num.charAt(head) == '9'){
                if( num.charAt(tail) != '6')
                    return false;
            }
            else
                return false;
            
            head += 1;
            tail -= 1;
        }
        if(head == tail)
            return (num.charAt(head) == '0' || num.charAt(head) == '1' || num.charAt(head) == '8');
        else
            return true;        
    }
}
