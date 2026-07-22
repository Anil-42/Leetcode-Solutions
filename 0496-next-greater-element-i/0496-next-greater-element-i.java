class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> mp = new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=m-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.empty())
            mp.put(nums2[i],-1);
            else
            mp.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }
}