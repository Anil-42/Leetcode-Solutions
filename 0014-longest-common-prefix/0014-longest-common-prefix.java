class Solution {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        int kids=0;
        boolean isEnd=false;
    }
    TrieNode root = new TrieNode();
    void insert(String word){
        TrieNode t = root;
        for(char c : word.toCharArray()){
            int i=c-'a';
            if(t.children[i]==null){
                t.children[i]=new TrieNode();
                t.kids++;
            }
            t=t.children[i];
        }
        t.isEnd=true;
    }
    String lcp(){
        TrieNode t=root;
        StringBuilder sb = new StringBuilder();
        while(t.isEnd!=true && t!=null && t.kids==1){
            for(int i=0;i<26;i++){
                if(t.children[i]!=null){
                    sb.append((char)(i+'a'));
                    t=t.children[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        for(String word : strs){
            insert(word);
        }
        return lcp();
    }
}