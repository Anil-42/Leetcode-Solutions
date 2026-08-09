class Solution {
    public boolean search(int[] nums, int k) {
        int n = nums.length;
        int l=0,r=n-1;
        while(l<=r){
            int m = l+((r-l)>>1);
            if(nums[m]==k){
                return true;
            }
            if(nums[l]==nums[m] && nums[m]==nums[r]){
                l++;
                r--;
                continue;
            }
            if(nums[l]<=nums[m]){
                if(nums[l]<=k && k<nums[m]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(nums[m]<k && k<=nums[r]){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
        }
        return false;
    }
}