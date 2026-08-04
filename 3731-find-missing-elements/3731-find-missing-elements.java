class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!(hs.contains(i))){
                res.add(i);
            }
        }
        return  res;
    }
}