class NumArray {
    List<Integer> li = new ArrayList<>();
    public NumArray(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            li.add(sum);
        }
    }
    
    public int sumRange(int left, int right) {
       if(left==0){
        return li.get(right);
       }
       return li.get(right)-li.get(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */