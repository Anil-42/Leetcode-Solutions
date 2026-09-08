class Solution {
    List<String> res = new ArrayList<>();
    void backtrack(int i, int j, StringBuilder sb, int n){
        if(sb.length()==2*n){
            res.add(sb.toString());
            return;
        }
        
        if(i<n){
            sb.append('(');
            backtrack(i+1,j,sb,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(j<i){
            sb.append(')');
            backtrack(i,j+1,sb,n);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        backtrack(0,0,sb,n);
        return res;
    }
}