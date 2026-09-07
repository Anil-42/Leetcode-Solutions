class Solution {
    boolean dfs(int i, int j, int k,char[][]board, String word){
        if(k==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 | j>=board[0].length || board[i][j]!=word.charAt(k)){
            return false;
        }

        board[i][j]='*';

        if(dfs(i+1,j,k+1,board,word) || dfs(i-1,j,k+1,board,word) || dfs(i,j+1,k+1,board,word) || dfs(i,j-1,k+1,board,word)){
            return true;
        }
        board[i][j]=word.charAt(k);
        return false;

    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
}