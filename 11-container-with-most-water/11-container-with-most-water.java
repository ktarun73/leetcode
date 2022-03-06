class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int lp=0;
        int rp=len-1;
        if(len==2){
            if(height[0]<height[1]){
                return height[0];
            }
            return height[1];
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