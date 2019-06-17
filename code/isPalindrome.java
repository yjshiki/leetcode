class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0 & x<=9)
            return true;
        String str = x + "";
        //System.out.println(str);
        int length = str.length();
        for(int i=0;i<=length/2;i++){
            if(str.charAt(i) != str.charAt(length-1-i))
                return false;
        }
        return true;
        
    }
}
