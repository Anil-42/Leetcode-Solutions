class Solution {
public:
    bool isCheck(int m, vector<int>& candies, long long k){
        long long count=0;
        for(int x:candies){
            count+=x/m;
        }
        return count>=k;
    }
    int maximumCandies(vector<int>& candies, long long k) {
        int low=1,high=*max_element(candies.begin(),candies.end()),ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isCheck(mid,candies,k)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
};