class Solution {
    public int findComplement(int num) {
       int c=0,n=num;
       while(n!=0){
        n=n>>1;
        c++;
       } 
       return ((1<<c)-1)^num;
    }
}