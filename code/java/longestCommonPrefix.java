class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        int small = smallestIndex(strs);
        String smallStr = strs[small];
        String result = "";
        System.out.println(smallStr);
        for(int i=0;i<=smallStr.length();i++)
            if(commonPrefix(smallStr.substring(0,i),strs,small) == true && i > result.length())
                result = smallStr.substring(0,i);       
        return result;
    }
    public int smallestIndex(String[] strs){
        int small = 0;
        for(int i=1;i<strs.length;i++)
            if(strs[i].length() < strs[small].length())
                small = i;
        return small;
    }
    public boolean commonPrefix(String str,String[] strs,int skip){
        int length = str.length();
        for(int i=0;i<strs.length;i++){
            if(!strs[i].substring(0,length).equals(str))
                return false;
        }
        return true;
    }
    

}
