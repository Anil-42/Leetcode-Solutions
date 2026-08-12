class Solution {
    boolean check(int[] arr,int mid,int m,int k){
        int n=arr.length;
        int f=0,b=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=mid){
                f++;
            }
            else{
                f=0;
            }
            if(f==k){
                b++;
                f=0;
            }
        }
        return b>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<m*k){
            return-1;
        }
        int maxele=bloomDay[0];
        int minele=bloomDay[0];
        for(int i=1;i<n;i++){
            if(bloomDay[i]>maxele){
                maxele=bloomDay[i];
            }
            else if(bloomDay[i]<minele){
                minele=bloomDay[i];
            }
        }
        int l=minele,r=maxele;
        int ans=-1;
        while(l<=r){
            int mid=l+((r-l)>>1);
            if(check(bloomDay,mid,m,k)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
}