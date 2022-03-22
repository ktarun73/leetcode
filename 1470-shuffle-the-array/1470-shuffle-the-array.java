class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ar=new int[2*n];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ar[i]=nums[a];
                a++;
            }
            else{
                ar[i]=nums[n];
                n++;
            }
     
        }
        return ar;
    }
}