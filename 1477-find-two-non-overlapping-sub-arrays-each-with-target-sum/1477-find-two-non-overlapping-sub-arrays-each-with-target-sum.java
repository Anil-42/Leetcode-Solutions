class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int l=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>target){
                sum-=arr[l];
                l++;
            }
            if(sum==target){
                if(l>0 && dp[l-1]!=Integer.MAX_VALUE){
                    ans = Math.min(ans,dp[l-1]+(r-l+1));
                }
                dp[r]=r-l+1;
            }
            if(r>0){
                dp[r] = Math.min(dp[r],dp[r-1]);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}