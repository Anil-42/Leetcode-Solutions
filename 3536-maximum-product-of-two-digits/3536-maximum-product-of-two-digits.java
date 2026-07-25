class Solution {
    public int maxProduct(int n) {
        int fmax=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        while(n>0){
            int v = n%10;
            if(v>fmax){
                smax=fmax;
                fmax=v;
            }
            else if(v>smax){
                smax=v;
            }
            n=n/10;
        }
        return fmax*smax;
    }
}