class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int p=start+(end-start)/2;
            if(nums[p]==target){
                return p;
            }
            if(nums[p]>target){
                end=p-1;
            }
            else{
                start=p+1;
            }
        }
        return start;
    }
}