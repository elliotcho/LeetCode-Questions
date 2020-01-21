class Solution {
    public int[] diStringMatch(String S) {
        int[] res=new int[S.length()+1];
        
        int left=0, right=S.length();
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='D'){
                res[i]=right;
                right--;
            }   
            
            else{
                res[i]=left; 
                left++;
            }
        }
        
        res[S.length()]=left;
        
        return res;
    }
}