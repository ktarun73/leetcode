class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int[] ans={-1,-1};
        if(nums.length==0) return ans;
        while(i<nums.length){
            if(nums[i]!=target) i++;
            else if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        while(j>=0){
            if(nums[j]!=target) j--;
            else if(nums[j]==target){
                ans[1]=j;
                break;
            }
        }
        return ans;
    }
}