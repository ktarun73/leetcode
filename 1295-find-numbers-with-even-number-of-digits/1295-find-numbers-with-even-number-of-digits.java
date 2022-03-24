class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(even(i)){
                count++;
            }
        }
        return count;
        
    }
    
    boolean even(int num){
        int numberOfDigits=digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    
    int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}