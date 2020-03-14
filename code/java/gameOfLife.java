class Solution {
    public void gameOfLife(int[][] board) {
        int count,l,r;
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                count = 0;
                l = 0;
                r = 0;
                if(i < board.length-1){
                    if(board[i+1][j] == 1 || board[i+1][j] == 2) 
                        count ++;
                    if(j < board[0].length - 1){
                        if(board[i][j+1] == 1 || board[i][j+1] == 2){
                            count ++;
                            r ++;
                        }
                        if(board[i+1][j+1] == 1 || board[i+1][j+1] == 2)
                            count ++;
                    }
                    if(j > 0){
                        if(board[i][j-1] == 1 || board[i][j-1] == 2){
                            count ++;
                            l ++;
                        }
                        if(board[i+1][j-1] == 1 || board[i+1][j-1] == 2)
                            count ++; 
                    }
                }
                if(i > 0){
                    if(board[i-1][j] == 1 || board[i-1][j] == 2)
                        count ++;
                    if(j < board[0].length - 1){
                        if(board[i][j+1] == 1 || board[i][j+1] == 2){
                            count ++;
                            r ++;
                        }
                        if(board[i-1][j+1] == 1 || board[i-1][j+1] == 2)
                            count ++;
                    }
                    if (j > 0){
                        if(board[i][j-1] == 1 || board[i][j-1] == 2){
                            count ++;
                            l ++;
                        }
                        if(board[i-1][j-1] == 1 || board[i-1][j-1] == 2)
                            count ++; 
                    }
                }
                if(l == 2)
                    count --;
                if(r== 2)
                    count --;
                if(board[i][j] == 1){
                    if(count < 2 || count > 3)
                        board[i][j] = 2;
                }
                else{
                    if(count == 3)
                        board[i][j] = 3;
                }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 2)
                    board[i][j] = 0;
                else if(board[i][j] == 3)
                    board[i][j] = 1;
            }
        }
    }
}
