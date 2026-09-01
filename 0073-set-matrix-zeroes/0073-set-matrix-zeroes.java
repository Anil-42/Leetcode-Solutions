class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
       boolean firstrow = false;
       boolean firstcol = false;
        // if any element in first row make its var true
       for(int i=0;i<n;i++){
        if(arr[i][0]==0){
            firstrow=true;
            break;
        }
       }
    //    if any element in first column 0 make its var true
       for(int j=0;j<m;j++){
        if(arr[0][j]==0){
            firstcol=true;
            break;
        }
       }
    //    iterate from (1,1) if any cell is zero make its firstrow ele and firstcol ele 0
       for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(arr[i][j]==0){
                arr[i][0]=0;
                arr[0][j]=0;
            }
        }
       }
    //    iterate next time from (1,1) if any cell firstrow or firstcol 0 make that cell 0
       for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(arr[i][0]==0 || arr[0][j]==0){
                arr[i][j]=0;
            }
        }
       }
    //  if firstro true make all its elements 0
       for(int i=0;i<n;i++){
        if(firstrow){
            arr[i][0]=0;
        }
       }
    //    if firstcol true make all its elements 0
       for(int j=0;j<m;j++){
        if(firstcol){
            arr[0][j]=0;
        }
       }
    }
}