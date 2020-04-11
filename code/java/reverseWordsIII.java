class Solution {
    public String reverseWordsIII(String s) {
        String[] lst = s.split(" ");
        if(lst.length <= 1)
            return reverse(s);
        String res = "";
        for(int i=0;i<lst.length;i++){
            String tmp = reverse(lst[i]).strip();
            if(tmp.length() > 0)
                res = res + tmp + " ";
        }
        return res.substring(0,res.length()-1);
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
