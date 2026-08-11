class Solution {
    int[] leftmax(int[] h){
        int n = h.length;
        int[] ans = new int[n];
        ans[0]=h[0];
        for(int i=1;i<n;i++){
            ans[i]=Math.max(ans[i-1],h[i]);
        }
        return ans;
    }
    int[] rightmax(int[] h){
        int n=h.length;
        int[] ans = new int[n];
        ans[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=Math.max(ans[i+1],h[i]);
        }
        return ans;
    }
    public int trap(int[] height) {
        int n = height.length;
        int[] left=leftmax(height);
        int[] right=rightmax(height);
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }
}