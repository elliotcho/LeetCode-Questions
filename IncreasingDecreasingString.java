class Solution {
    public String sortString(String s) {
        StringBuilder res=new StringBuilder();
        
        int[] bucket = new int[26];
        
        for(char c: s.toCharArray()){
            bucket[c-97]++;
        }
        
        int idx=0;
        
        while(idx<s.length()){
            for(int i=0;i<26;i++){
                if(bucket[i]>0){
                    bucket[i]--;
                    
                    res.append((char)(i+97));
                    
                    idx++;
                }
            }
            
            for(int i=25;i>=0;i--){
                if(bucket[i]>0){
                    bucket[i]--;
                    
                    res.append((char)(i+97));
                    
                    idx++;
                }
            }
        }
        
        return res.toString();
    }
}