class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int count=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push('(');
            }
            else if(!st.isEmpty()){
                st.pop();
            }
            else{
                count++;
            }
        }
        return count+st.size();
    }
}