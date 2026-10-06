class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        int j=0;
        int a=n;
        while(a>0){
            int count=0;
            for(int i=1;i<n;i++){
                if(((i>>j)&1)==1){
                    count++;
                }
            }
            for(int i=0;i<n;i++){
                if(((nums[i]>>j)&1)==1){
                    count--;
                }
            }
            if(count<0){
                ans+=(1<<j);
            }
            j++;
            a>>=1;
        }
        return ans;
    }
}