class Solution {
    boolean check(int[] arr,int m){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=m)c++;
        }
        return c>=m;
    }
    public int hIndex(int[] citations) {
        int n=citations.length;
        int l=1,r=n;
        int ans=0;
        while(l<=r){
            int m=l+((r-l)>>1);
            if(check(citations,m)){
                ans=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        } 
        return ans;
    }
}