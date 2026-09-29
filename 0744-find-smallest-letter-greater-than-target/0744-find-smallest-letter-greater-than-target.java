class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int l=0,r=n-1;
        char ans='#';
        while(l<=r){
            int m = l+((r-l)>>1);
            if(letters[m]>target){
                ans=letters[m];
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return  ans=='#' ? letters[0] : ans;
    }
}