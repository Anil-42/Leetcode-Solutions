class Solution {
    int solve(int n,int[] dp){
        if(n==0 || n==1){
            dp[n]=n;
            return n;
        }
        if(dp[n]==-1){
            dp[n]=solve(n-1,dp)+solve(n-2,dp);
        }
        return dp[n];
    }

    public int fib(int n) {
        //using dp memoization
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}