class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){return true;}
        if(x<0 || x%10==0){return false;}
        int temp=0;

        while(x>temp){
          int pop = x%10;
          x/=10;
          temp=(temp*10)+pop;  
            
        }
        
        if(x==temp||x==temp/10){
            return true;
        }
        return false;
    }
}