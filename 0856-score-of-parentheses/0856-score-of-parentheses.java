class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(count);
                count=0;
            }
            else{
                count = st.pop() + Math.max(2*(count),1);
            }
        }
        return count;
    }
}