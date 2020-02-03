class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        
        Arrays.sort(s);
        
        int g_pointer=0, s_pointer=0, res=0;
        
        while(g_pointer<g.length && s_pointer<s.length){
            if(g[g_pointer]<=s[s_pointer]){
                g_pointer++;
                
                s_pointer++;
                
                res++;
            }
            
            else{
                s_pointer++;
            }
        }
        
        return res;
    }
}