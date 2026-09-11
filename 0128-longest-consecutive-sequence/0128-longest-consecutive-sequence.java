class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int x : nums){
            s.add(x);
        }
        int longest=Integer.MIN_VALUE;
        for(int x : s){
            if(!s.contains(x-1)){
                int length=1;

                while(s.contains(x+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest==Integer.MIN_VALUE ? 0 : longest;
    }
}