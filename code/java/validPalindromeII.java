class Solution {
    public boolean validPalindromeII(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left ++;
                right --;
            }
            else
                return (helper(s.substring(left,right)) || helper(s.substring(left+1,right+1)));
        }
        return true;
    }
    
    public boolean helper(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left<right)
            if(s.charAt(left++) != s.charAt(right--))
                return false;
        return true;
    }
}
