class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n=boxTypes.length;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        int i=0,maxUnits=0;
        while(truckSize!=0 && i<n){
            if(boxTypes[i][0]<=truckSize){
                maxUnits+=(boxTypes[i][1]*boxTypes[i][0]);
                truckSize-=boxTypes[i][0];
            }
            else{
                maxUnits+=(boxTypes[i][1]*truckSize);
                truckSize=0;
            }
            i++;
        }
        return maxUnits;
    }
}