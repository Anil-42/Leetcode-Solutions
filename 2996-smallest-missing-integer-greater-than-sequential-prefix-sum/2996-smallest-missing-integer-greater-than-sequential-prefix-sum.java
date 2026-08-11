class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0]+1;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==sum){
                sum+=1;
            }
            else if(nums[i]>sum){
                break;
            }
        }
        return sum;
    }
}