class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int[] x : intervals){
            if(res.size()==0 || res.get(res.size()-1)[1]<x[0]){
                res.add(x);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1], x[1]);
                }
        }
        int[][] f = new int[res.size()][];
        for(int i=0;i<res.size();i++){
            f[i]=res.get(i);
        }
        return f;
    }
}