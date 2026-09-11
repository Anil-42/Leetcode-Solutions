class Solution {
    boolean check(int i, int j, String s, String p,Boolean[][] dp){
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(j==p.length()){
            return dp[i][j] = (i==s.length());
        }

        boolean res;
        boolean same = (i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'));
        if(j+1<p.length() && p.charAt(j+1)=='*'){
            res = check(i,j+2,s,p,dp) || (same && check(i+1,j,s,p,dp));
        }
        else{
            res = same && check(i+1,j+1,s,p,dp);
        }
        return dp[i][j] = res; 
    }
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length()+1][p.length()+1];
        return check(0,0,s,p,dp);
    }
}