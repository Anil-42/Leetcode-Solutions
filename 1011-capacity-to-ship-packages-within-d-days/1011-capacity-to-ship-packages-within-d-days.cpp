class Solution {
public:
    bool check(int k,vector<int>& w,int days){
        int count=1,curr=0;
        for(int i=0;i<w.size();i++){
            if(w[i]>k)return false;
            if(curr+w[i]>k){
                count++;
                curr=w[i];
            }
            else{
                curr+=w[i];
            }
        }
        return count<=days;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int sum=accumulate(weights.begin(),weights.end(),0);
        int low=1,high=sum,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(mid,weights,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
};