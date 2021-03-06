class Solution {
    public int repeatedStringMatch(String A, String B) {
        int res=0;
        
        StringBuilder sb=new StringBuilder();
        
        while(sb.length()<B.length()){
            sb.append(A);
            res++;
        }
        
        if(sb.toString().contains(B)){return res;}
        
        sb.append(A);
        res++;
        
        return sb.toString().contains(B)? res: -1;
    }
}