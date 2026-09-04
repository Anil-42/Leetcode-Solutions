class Solution {
    int maxval(int n,int[] nums){
        int maxele=nums[0];
        for(int i=1;i<=n;i++){
            if(maxele<nums[i]){
                maxele=nums[i];
            }
        }
        return maxele;
    }
    int minval(int n,int[] nums){
        int minele=nums[n];
        for(int i=n+1;i<nums.length;i++){
            if(minele>nums[i]){
                minele=nums[i];
            }
        }
        return minele;
    }
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if((maxval(i,nums)-minval(i,nums))<=k){
                return i;
            }
        }
        return -1;
    }
}