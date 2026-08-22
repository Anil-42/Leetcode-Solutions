class Solution {
    public int[][] findFarmland(int[][] land) {
        int n=land.length;
        int m=land[0].length;

        List<int[]> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j]==1){
                    if ((i == 0 || land[i - 1][j] == 0) && (j == 0 || land[i][j - 1] == 0)) {
                        int r2=i;
                        int c2=j;

                        while(r2+1<n && land[r2+1][j]==1){
                            r2++;
                        }
                        while(c2+1<m && land[i][c2+1]==1){
                            c2++;
                        }

                        res.add(new int[]{i,j,r2,c2});
                    }
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}