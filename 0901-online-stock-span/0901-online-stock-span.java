class StockSpanner {
    Stack<Integer> st;
    public StockSpanner() {
         st = new Stack<>();
    }
    
    public int next(int price) {
        int c=1;
        while(!st.empty() && st.peek()<=price){
            st.pop();
            c+=st.pop();
        }
        st.push(c);
        st.push(price);
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */