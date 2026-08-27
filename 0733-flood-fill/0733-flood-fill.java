class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int incolor = image[sr][sc];
        if(incolor==color){return image;}
        int n = image.length;
        int m = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        image[sr][sc]=color;
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] v = q.poll();
            for(int k=0;k<4;k++){
                int rr = v[0]+dir[k][0];
                int rc = v[1]+dir[k][1];
                if(rr>=0 && rc>=0 && rr<n && rc<m && image[rr][rc]==incolor){
                    image[rr][rc]=color;
                    q.offer(new int[]{rr,rc});
                }
            }
        }
        return image;
    }
}