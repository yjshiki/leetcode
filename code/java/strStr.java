class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
            return -1;
        else if(needle.length() == haystack.length())
            if (needle.equals(haystack) == true)
                return 0;
            else
                return -1;
        else{
            String temp;
            for(int i=0;i+needle.length()<=haystack.length();i++){
                temp = haystack.substring(i,i+needle.length());
                if (needle.equals(temp) == true)
                    return i;
            }
            return -1;
        }
    }
}
