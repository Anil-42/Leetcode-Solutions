class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        int k=1;
        while(Math.pow(5,k)<=n){
            ans+=(n/(Math.pow(5,k)));
            k++;
        }
        return ans;
    }
}