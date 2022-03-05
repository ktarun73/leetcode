class Solution {
    public int removeDuplicates(int[] nums) {
        int p=0;
        int lp=-1;
        for(int i=1;i<nums.length;i++){
            lp++;
            if(nums[i]!=nums[lp]){
                p++;
                nums[p]=nums[i];
            }
        }
        return p+1;
    }
}