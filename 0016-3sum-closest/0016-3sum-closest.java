class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int res=0;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return sum;
                }
                int d=Math.abs(sum-target);
                if(d<diff){
                    diff=d;
                    res=sum;
                }

                if(sum<target){
                    l++;
                }
                else{
                    r--;
                }

            }
        }
        return res;
    }
}