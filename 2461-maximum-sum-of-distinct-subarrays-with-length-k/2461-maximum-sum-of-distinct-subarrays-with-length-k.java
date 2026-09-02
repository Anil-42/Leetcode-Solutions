class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length;
        long sum=0;
        long maxSum=0;
        Set<Integer> s = new HashSet<>();
        int l=0;
        for(int r=0;r<n;r++){
            while(s.contains(arr[r])){
                s.remove(arr[l]);
                sum-=arr[l];
                l++;
            }
            s.add(arr[r]);
            sum+=arr[r];
            if(k==r-l+1){
                maxSum=Math.max(maxSum,sum);
                sum-=arr[l];
                s.remove(arr[l]);
                l++;
            }
        }
        return maxSum;
    }
}