class Solution {
    int lcs(int i,int j,String s1, String s2, int[][]dp){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int with=0;
        int without=0;
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+lcs(i+1,j+1,s1,s2, dp);
        }
        else{
            without=lcs(i,j+1,s1,s2, dp);
            with = lcs(i+1,j,s1,s2, dp);
        }
        return dp[i][j]=Math.max(with,without);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
         return lcs(0,0,text1,text2,dp);
    }
}