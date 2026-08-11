class Solution {
    boolean check(int[] nums,int m,int t){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil(1.0*nums[i]/m);
        }
        return sum<=t;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int maxele=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>maxele){
                maxele=nums[i];
            }
        }
        int l=1,r=maxele;
        int ans=0;
        while(l<=r){
            int m=l+((r-l)>>1);
            if(check(nums,m,threshold)){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}