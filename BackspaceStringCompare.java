class Solution {
    public boolean backspaceCompare(String S, String T) {
        char[] sStack=new char[S.length()]; int sTop=-1;
        char[] tStack=new char[T.length()]; int tTop=-1;
        
        for(int i=0;i<S.length();i++){
            if(sTop!=-1 && S.charAt(i)=='#'){
                sTop--;
            }
            if(S.charAt(i)!='#'){sTop++; sStack[sTop]=S.charAt(i);}
       }
        
       for(int j=0;j<T.length();j++){
            if(tTop!=-1 && T.charAt(j)=='#'){
                tTop--;
            }
            
            if(T.charAt(j)!='#'){tTop++; tStack[tTop]=T.charAt(j);}
        }
        
       String sString=String.valueOf(sStack).substring(0, sTop+1);
       String tString=String.valueOf(tStack).substring(0, tTop+1);
        
       return sString.equals(tString);
    }
}
