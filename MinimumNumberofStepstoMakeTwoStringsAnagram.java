class Solution {
    public int minSteps(String s, String t) {
        int[] map=new int[26];
        
        int res=0;
        
        for(char c: s.toCharArray()){
            map[c-97]++;
        }
        
        for(char c: t.toCharArray()){
            if(map[c-97]>0){
                map[c-97]--;
            }
            
            else{
                res++;
            }
        }
        
        return res;
    }
}