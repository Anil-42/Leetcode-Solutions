class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        int maxlength=Integer.MIN_VALUE;
        int l=0,n=s.length();
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.get(c)>2){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            maxlength = Math.max(maxlength,r-l+1);
        }
        return maxlength;
    }
}