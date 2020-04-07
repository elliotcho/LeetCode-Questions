class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res=new int[S.length()];
        
        int c_pointer=S.length()*-1;
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C){
                c_pointer=i;
            }
            
            res[i]=i-c_pointer;
        }
        
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)==C){
                c_pointer=i;
            }
            
            res[i]=Math.min(res[i], Math.abs(i-c_pointer));
        }
        
        return res;
    }
}