class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n==1 || n==2)return s;
        String s1=s.substring(0,n/2);
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1=new String(chars);
        String s2=new StringBuilder(s1).reverse().toString();
        if(n%2==1){
            return s1+s.charAt(n/2)+s2;
        }

        return s1+s2;
    }
}