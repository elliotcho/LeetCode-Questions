class Solution {
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> res=new ArrayList<>();
        
        int[] bucket=new int[26];
    
        for(int i=0;i<S.length();i++){bucket[S.charAt(i)-97]=i;}
        
        int start=0, end=0;
        
        for(int j=0;j<S.length();j++){
            end=Math.max(bucket[S.charAt(j)-97], end);
            
            if(end==j){
                res.add(end-start+1);
                start=end+1;
            }
        }
        
        return res;
    }
}