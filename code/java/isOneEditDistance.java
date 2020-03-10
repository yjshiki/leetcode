class Solution {
    public boolean isOneEditDistance(String s, String t) {
        return (minDistance(s,t) == 1);
    }
    
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 == 0)
            return len2;
        if(len2 == 0)
            return len1;
        int len_max = Math.max(len1,len2);
        int[][] d = new int[len_max+1][len_max+1];
        for(int i=0;i<len1+1;i++)
            d[i][0] = i;
        for(int j=0;j<len2+1;j++)
            d[0][j] = j;
        for(int i=1;i<len1+1;i++)
            for(int j=1;j<len2+1;j++){
                int temp = d[i-1][j-1];
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    temp--;
                d[i][j] = 1 + Math.min((Math.min(d[i-1][j],d[i][j-1])),temp);
            }
        return d[len1][len2];
    }
}
