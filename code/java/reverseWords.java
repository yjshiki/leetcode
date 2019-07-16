class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] lst = s.split(" ");
        if(lst.length == 0)
            return "";
        String res = "";
        for(int i=0;i<lst.length;i++){
            String temp = lst[i].trim();
            if(temp.equals("")==false){
                res = temp + res;
                if(i!=lst.length-1)
                    res = " " + res;
            }
        }
        return res;
    }
}
