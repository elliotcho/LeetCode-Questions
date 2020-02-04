class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_pointer=0, t_pointer=0;
        
        while(t_pointer<t.length()){
            if(s_pointer<s.length()
               && s.charAt(s_pointer)==t.charAt(t_pointer)){
                s_pointer++;
            }
            
            t_pointer++;
        }
        
        return s_pointer==s.length();
    }
}