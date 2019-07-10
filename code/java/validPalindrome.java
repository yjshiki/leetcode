class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 0)
            return true;
        s = s.toLowerCase();
        int head = 0;
        int tail = s.length() - 1;
        while(head < tail){
            if(helper(s.charAt(head)) == false){
                head++;
                continue;
            }
            if(helper(s.charAt(tail)) == false){
                tail--;
                continue;
            }
            if(s.charAt(head) != s.charAt(tail))
                return false;
            head++;
            tail--;
        }

        return true;     
    }
    
    public boolean helper(char c){
        if((c >= '0' && c<= '9') || (c >= 'a'  && c<= 'z'))
            return true;
        else
            return false;
    }
}
