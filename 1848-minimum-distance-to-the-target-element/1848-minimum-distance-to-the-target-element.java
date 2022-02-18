class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int tIn=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                tIn=i;
                break;
            }
        }
        int abs=Math.abs(tIn-start);
        for(int i=tIn+1;i<nums.length;i++){
            if(nums[i]==target && Math.abs(i-start)<abs){
             abs=Math.abs(i-start);   
            }
        }
        return abs;
    }
}