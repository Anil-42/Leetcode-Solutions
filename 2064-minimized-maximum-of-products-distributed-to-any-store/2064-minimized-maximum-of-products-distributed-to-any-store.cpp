class Solution {
public:
    bool isCheck(int k,vector<int>& quantities, int n){
        int quantity=0;
        for(int x:quantities){
            quantity+=ceil(1.0*x/k);
        }
        return quantity<=n;
    }
    int minimizedMaximum(int n, vector<int>& quantities) {
        int low=1,high=*max_element(quantities.begin(),quantities.end()),ans;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isCheck(mid,quantities,n)){
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