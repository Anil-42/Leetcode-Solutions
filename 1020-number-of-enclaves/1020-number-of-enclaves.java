class Solution {
    void dfs(int[][]grid, int i, int j){
        grid[i][j]=0;
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int k=0;k<4;k++){
            int r = i + dir[k][0];
            int c = j + dir[k][1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length &&grid[r][c]==1){
                dfs(grid,r,c);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    int c=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(i==0 || j==0 || i==n-1 || j==m-1){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                c++;
            }
        }
    }
    return c;
    }
}