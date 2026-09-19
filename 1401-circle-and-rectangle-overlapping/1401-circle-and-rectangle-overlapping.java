class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int[][] c = new int[4][2];
        c[0]=new int[]{x1,y2};
        c[1]=new int[]{x1,y1};
        c[2]=new int[]{x2,y1};
        c[3]=new int[]{x2,y2};


        if(c[1][0]>xCenter+radius || c[2][0]<xCenter-radius){
            return false;
        }
        if(c[0][1]<yCenter-radius || c[2][1]>yCenter+radius){
            return false;
        }
        if(xCenter<x1 && yCenter>y2){
            return (xCenter-x1)*(xCenter-x1)+(yCenter-y2)*(yCenter-y2)<=radius*radius;
        }
        if(xCenter<x1 && yCenter<y1){
            return (xCenter-x1)*(xCenter-x1)+(yCenter-y1)*(yCenter-y1)<=radius*radius;
        }
        if(xCenter>x2 && yCenter<y1){
            return (xCenter-x2)*(xCenter-x2)+(yCenter-y1)*(yCenter-y1)<=radius*radius;
        }
        if(xCenter>x2 && yCenter>y2){
            return (xCenter-x2)*(xCenter-x2)+(yCenter-y2)*(yCenter-y2)<=radius*radius;
        }
        return true;
    }
}