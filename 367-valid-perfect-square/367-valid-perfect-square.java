class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        while(start<=end){
            long pivot=start+(end-start)/2;
            long square=pivot*pivot;
            if(square==num){
                return true;
            }
            if(square>num){
                end=pivot-1;
            }
            else{
                start=pivot+1;
            }
        }
        return false;
    }
}