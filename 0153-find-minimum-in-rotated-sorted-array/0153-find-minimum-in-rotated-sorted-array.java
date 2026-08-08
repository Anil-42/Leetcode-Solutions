class Solution {
    public int findMin(int[] arr) {
        int l=0,r=arr.length-1;
        int mini=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+((r-l)>>>1);
            if(arr[m]<mini)mini=arr[m];
            
            if(arr[l]<=arr[m]){
                if(arr[m]<arr[r]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                r=m-1;
            }
        }
        return mini;
    }
}