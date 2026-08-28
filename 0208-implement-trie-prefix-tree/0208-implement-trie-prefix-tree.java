class Trie {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode t = root;
        for(char c : word.toCharArray()){
            int i = c-'a';
            if(t.children[i]==null){
                t.children[i]=new TrieNode();
            }
            t=t.children[i];
        }
        t.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode t = root;
        for(char c : word.toCharArray()){
            int i=c-'a';
            if(t.children[i]==null){
                return false;
            }
            t=t.children[i];
        }
        return t.isEnd==true;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode t = root;
        for(char c : prefix.toCharArray()){
            int i=c-'a';
            if(t.children[i]==null){
                return false;
            }
            t=t.children[i];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */