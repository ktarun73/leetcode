class Solution {
    public void moveZeroes(int[] nums) {
      int len=nums.length;
        int ar[]=new int[len];  
        int a=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                ar[a]=nums[i];
                a++;
            }
        }
        for(int i=0;i<len;i++){
            nums[i]=ar[i];
        }
    }
}