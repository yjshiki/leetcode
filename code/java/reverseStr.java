class Solution {
    public String reverseStr(String s, int k) {
        if(s.length() < k)
            return reverse(s);
        else if(s.length()>=k && s.length() < 2* k){
            return reverse(s.substring(0,k)) + s.substring(k,s.length());
        }
        else{
            return reverse(s.substring(0,k)) + s.substring(k,2*k) 
                + reverseStr(s.substring(2*k,s.length()),k);
        }
    }
    
    public String reverse(String s){
        if(s.length() == 0)
            return s;
        String res = "";
        for(int i=s.length();i>0;i--)
            res = res + s.substring(i-1,i);
        return res;
    }
}
