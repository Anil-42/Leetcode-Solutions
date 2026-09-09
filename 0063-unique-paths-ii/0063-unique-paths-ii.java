class Solution {
    int paths(int m, int n, int[][]arr, int[][]dp){
        if(m<0 || n<0 || arr[m][n]==1){return 0;}
        if(m==0 && n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n]=paths(m-1,n,arr,dp)+paths(m,n-1,arr,dp);
        return dp[m][n];
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        if(arr[0][0]==1 || arr[m-1][n-1]==1){
            return 0;
        }
        // boolean r = false;
        // boolean c = false;
        // for(int i=0;i<m;i++){
        //     if(arr[i][0]==1){
        //         r=true;
        //     }
        //     if(r){
        //         arr[i][0]=1;
        //     } 
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[0][i]==1){
        //         c=true;
        //     }
        //     if(c){
        //         arr[0][i]=1;
        //     } 
        // }
        return paths(m-1,n-1,arr,dp);
    }
}