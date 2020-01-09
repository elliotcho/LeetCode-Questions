class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sBucket=new char[256];
        char[] tBucket=new char[256];
        
        for(int i=0;i<s.length();i++){
           if(sBucket[s.charAt(i)]=='\u0000'){
               sBucket[s.charAt(i)]=t.charAt(i);
           }
           else{
               if(sBucket[s.charAt(i)]!=t.charAt(i)){
                   return false;
               }
           } 
            
            
           if(tBucket[t.charAt(i)]=='\u0000'){
               tBucket[t.charAt(i)]=s.charAt(i);
           }
           else{
               if(tBucket[t.charAt(i)]!=s.charAt(i)){
                   return false;
               }
           }
        }       
        
        return true;
    }
}