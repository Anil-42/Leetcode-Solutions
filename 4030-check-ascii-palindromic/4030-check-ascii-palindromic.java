class Solution {
    public boolean isPalindromic(String s) {
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String binary = Integer.toBinaryString(s.charAt(i));
            String pad = String.format("%8s", binary).replace(' ', '0');
            sb.append(pad);
        }
        int l = 0, r = sb.length() - 1;
        while (l < r) {
            if (sb.charAt(l) != sb.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}