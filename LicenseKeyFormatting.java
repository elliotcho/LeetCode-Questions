class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S=S.toUpperCase();
        S=S.replaceAll("-", "");
        
        StringBuilder res=new StringBuilder(S);
        
        for(int i=S.length()-K;i>0;i-=K){
            res.insert(i, "-");
        }
        
        return res.toString();
    }
}