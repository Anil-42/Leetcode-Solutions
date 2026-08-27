class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n= nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            int t=i;
            int c=0;
            while(t>0){
                if((t&1)==1){
                    c++;
                }
                t=t>>1;
            }
            if(c==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}