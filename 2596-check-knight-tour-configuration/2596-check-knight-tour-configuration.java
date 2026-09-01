class Solution {
    class ChessNode{
        int row;
        int col;
        int val;
        public ChessNode(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){return false;}
        int n=grid.length;
        Queue<ChessNode> q = new LinkedList<>();
        int[][] dir={{-2,1},{-2,-1},{2,1},{2,-1},{-1,2},{-1,-2},{1,-2},{1,2}};
        q.offer(new ChessNode(0,0,grid[0][0]));
        int k=1;
        while(!q.isEmpty()){
            ChessNode v = q.poll();
            for(int i=0;i<8;i++){
                int rr = v.row + dir[i][0];
                int rc = v.col + dir[i][1];
                if(rr>=0 && rc>=0 && rr<n && rc<n && grid[rr][rc]==v.val+1){
                    q.offer(new ChessNode(rr,rc,grid[rr][rc]));
                    k++;
                }
            }
        }
        return k == n*n;
    }
}