class Solution {
   
    public List<Integer> findAnagrams(String s, String p) {
        int[] pc = new int[26];
        int[] sc = new int[26];
        List<Integer> res = new ArrayList<>();
        if(p.length()>s.length()){
            return res;
        }
        for(int i=0;i<p.length();i++){
            pc[p.charAt(i)-'a']++;
            sc[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pc,sc)){
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            sc[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(pc,sc)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}