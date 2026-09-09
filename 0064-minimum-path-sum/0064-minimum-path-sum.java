class Solution {
    int minimum(int m, int n,int[][] dp,int[][] grid){
        if(m<0||n<0){
            return Integer.MAX_VALUE;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(m==0 && n==0){
            return dp[m][n]=grid[m][n];
        }
        dp[m][n]=grid[m][n]+Math.min(minimum(m-1,n,dp,grid),minimum(m,n-1,dp,grid));

        return dp[m][n];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return minimum(m-1,n-1,dp,grid);
    }
}