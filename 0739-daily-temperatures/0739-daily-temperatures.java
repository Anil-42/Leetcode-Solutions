class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        Arrays.fill(res,0);
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && t[st.peek()]<=t[i]){
                st.pop();
            }
            if(!st.empty()){
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}