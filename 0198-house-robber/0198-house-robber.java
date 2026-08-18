class Solution {
    public int rob(int[] nums) {
        int prev1=0;
        int prev2=nums[0];

        for(int i=2;i<=nums.length;i++){
            int curr=Math.max(prev2,prev1+nums[i-1]);
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}