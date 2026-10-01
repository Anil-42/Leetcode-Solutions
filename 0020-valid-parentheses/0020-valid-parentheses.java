class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                st.push(currentChar);
            } else {
                if (st.isEmpty()) return false;
                
                char t = st.peek();
                st.pop();
                
                if (currentChar == ')' && t != '(') return false;
                else if (currentChar == ']' && t != '[') return false;
                else if (currentChar == '}' && t != '{') return false;
            }
        }
        return st.isEmpty();
    }
}
