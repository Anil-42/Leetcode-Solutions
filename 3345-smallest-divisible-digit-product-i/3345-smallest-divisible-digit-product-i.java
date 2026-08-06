class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int pro=1,temp=n;
            while(temp>0){
                pro*=temp%10;
                temp/=10;
            }
            if(pro%t==0){
                break;
            }
            n++;
        }
        return n;
    }
}