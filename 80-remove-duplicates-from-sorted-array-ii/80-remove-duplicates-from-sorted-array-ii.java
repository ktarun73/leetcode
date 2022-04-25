class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<3) return n;
        int in=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[in-2]){
                nums[in]=nums[i];
                in++;
            }
        }
        return in;
    }
}