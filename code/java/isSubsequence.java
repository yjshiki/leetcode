class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        int i = 0;
        int j = 0;
        while(j < t.length()){
            if(s.charAt(i) == t.charAt(j))
                i = i + 1;
            j = j + 1;
            if(i == s.length())
                return true;
        }
        return false;
    }
}
