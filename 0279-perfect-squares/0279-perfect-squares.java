class Solution {
    int solve(int n, int[] dp) {
        if (n <= 1) {
            dp[n] = n;
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int v = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            v = Math.min(v, solve(n - i * i, dp));
        }
        dp[n] = 1 + v;
        return dp[n];
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
}