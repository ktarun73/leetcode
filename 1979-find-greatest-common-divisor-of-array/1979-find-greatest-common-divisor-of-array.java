class Solution {
    public int findGCD(int[] nums) {
        int smallest=nums[0];
        int largest=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        
        int gcd=1;
        
        for(int i=2;i<=largest && i<=smallest;i++){
            if(largest%i==0 && smallest%i==0){
                gcd=i;
            }
        }
        
        return gcd;
    }
}