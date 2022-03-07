class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLen = 0;
        int len = s.length();
        int[] ch = new int[len];
        for(int i=0 ; i<len ; i++){
            ch[i] = s.charAt(i);
        }
        
        for(int i=len-1;i>=0;i--){
            //32 is acii code for space;
            if(ch[i]==32 && lastWordLen>0){ 
                return lastWordLen;
            }
            
            if(ch[i]!=32){
                lastWordLen++;
            }
            
        }
        return lastWordLen;
    }
}