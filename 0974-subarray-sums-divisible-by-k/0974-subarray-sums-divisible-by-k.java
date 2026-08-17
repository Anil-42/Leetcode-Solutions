class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remcount = new int[k];

        int count=0;
        int sum=0;
        remcount[0]=1;

        for(int num:nums){
            sum+=num;
            int rem = sum%k;
            if(rem<0){
                rem+=k;
            }

            count+=remcount[rem];
            remcount[rem]++;
        }
        return count;
    }
}