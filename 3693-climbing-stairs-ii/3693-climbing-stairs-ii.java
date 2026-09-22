class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int j=1;j<=n;j++){
            for(int i=1;i<=3;i++){
                int k=j-i;
                if(k>=0 && dp[k]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[k]+costs[j-1]+((j-k)*(j-k)) );
                }
            }
        }
        return dp[n];
    }
}