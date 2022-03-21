class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2){
            return false;
        }
        
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                list.add(i);
            }
            
            if(list.size()>1){
                return false;
            }
        }
        if(list.size()==0){
            return false;
        }
        return true;
    }
}