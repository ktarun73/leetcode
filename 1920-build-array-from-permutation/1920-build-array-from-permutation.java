class Solution {
    public int[] buildArray(int[] nums) {
        int len=nums.length;
        int[] ar=new int[len];
        for(int i=0;i<len;i++){
             ar[i]=nums[nums[i]];
        }
        
        return ar;
    }
}