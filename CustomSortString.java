class Solution {
    public String customSortString(String S, String T) {
        int[] bucket=new int[26];
        
        StringBuilder res=new StringBuilder();
        
        for(char t: T.toCharArray()){bucket[t-97]++;}
        
        for(char s: S.toCharArray()){
            while(bucket[s-97]>0){
                res.append(s);
                bucket[s-97]--;
            }
        }
        
        for(int i=0;i<bucket.length;i++){
            while(bucket[i]>0){
                res.append((char)(i+97));
                bucket[i]--;
            }
        }
            
        return res.toString();
    }
}