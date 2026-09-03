class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int mo=Integer.MAX_VALUE,me=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if((nums1[i]&1)==1){
                mo=Math.min(mo,nums1[i]);
            }
            else{
                me=Math.min(me,nums1[i]);
            }
        }
        if(mo==Integer.MAX_VALUE){
            return true;
        }
        else if(me==Integer.MAX_VALUE){
            return true;
        }
        else if(mo<me){
            return true;
        }
        return false;
    }
}