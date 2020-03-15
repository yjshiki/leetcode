class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0)
            return false;
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(dfs(board,i,j,word) == true)
                    return true;
        return false;
    }
    
    public boolean dfs(char[][] board,int i,int j,String word){
        if(word.length() == 0)
            return true;
        if(i < 0 || i > board.length-1 || j < 0 || j > board[0].length-1 || board[i][j] != word.charAt(0))
            return false;
        char tmp = board[i][j];
        board[i][j] = '#';
        boolean res;
        String newWord = word.substring(1,word.length());
        res = dfs(board,i-1,j,newWord) || dfs(board,i+1,j,newWord) || dfs(board,i,j-1,newWord) || dfs(board,i,j+1,newWord);
        board[i][j] = tmp;
        return res;
    }
}
