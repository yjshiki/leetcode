class Solution {
    public int titleToNumber(String s) {
        int[] A = new int[s.length()];
        for(int i=0;i<s.length();i++)
            A[i] = (int)Math.pow(26,s.length()-1-i);
        int res = 0;
        for(int i=0;i<s.length();i++)
            res += A[i] * ((int)s.charAt(i) - ((int)'A') + 1);
        return res;
    }
}
