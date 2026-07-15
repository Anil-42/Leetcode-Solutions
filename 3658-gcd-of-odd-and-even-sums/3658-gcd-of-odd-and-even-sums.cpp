class Solution {
public:
    long long findGcd(long long a,long long b){
        while(b!=0){
            long long reminder=a%b;
            a=b;
            b=reminder;
        }
        return a;
    }
    int gcdOfOddEvenSums(int n) {
        long long oddSum=0,evenSum=0;
        long long currOdd=1,currEven=2;
        for(int i=0;i<n;i++){
            oddSum+=currOdd;
            evenSum+=currEven;

            currOdd+=2;
            currEven+=2;
        }
        return findGcd(oddSum,evenSum);
    }
};