class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l=0, r=n-1;

        while(l<r){
            int m = l+((r-l)>>1);
            if(nums[m]!=nums[m-1] && nums[m]!=nums[m+1]){
                return nums[m];
            }
            if(nums[m]==nums[m-1]){
                m=m-1;
            }
            if(m%2==0){
                l=m+2;
            }
            else{
                r=m-1;
            }
        }
        return nums[l];
    }
}