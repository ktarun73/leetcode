class Solution {
    public int arrangeCoins(int n) {
        int steps=0;
        // int j=1;
        int temp=n;
        for(int i=1;i<=temp;i++){
            if(n<i){
                break;
            }
            steps++;
            n=n-i;
        }
        return steps;
    }
}