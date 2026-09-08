class Solution {
    char[][] comb = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    List<String> res = new ArrayList<>();

    void backtrack(int i, StringBuilder sb, String digits){
        if(sb.length()>0 && i==digits.length()){
            res.add(sb.toString());
            return ;
        }
        int v = (int)digits.charAt(i)-'0';
        for(int j=0;j<comb[v].length;j++){
            sb.append(comb[v][j]);
            backtrack(i+1,sb,digits);

            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        backtrack(0,sb,digits);

        return res;
    }
}