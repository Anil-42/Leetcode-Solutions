class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int res=0;
        for (Integer key : hm.keySet()) {
            if(hm.get(key)>1){
                res^=key;
            }
        }
        return res;
    }
}