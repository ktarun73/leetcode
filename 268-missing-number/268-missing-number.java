class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }
        int temp=0;
        int i=0;
        while(i<nums.length-1){
            i++;
            temp++;
            if(nums[i]!=temp){
                return temp;
            }
        }
        return nums[nums.length-1]+1;
    }
}