class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int lp=0;
        int rp=len-1;
        if(lp==(rp-1)){
            if(height[lp]>height[rp]){
                return height[rp];
            }
            else{
                return height[lp];
            }
        }
        
        int max=0;
        while(true){
            int area=1;
            if(height[rp]>height[lp]){
                area=height[lp]*(rp-lp);
                lp++;
            }
            else{
                area=height[rp]*(rp-lp);
                rp--;
            }
            if(max<area){
                max=area;
            }
            if(lp==rp){
                break;
            }
        }
        return max;
    }
}