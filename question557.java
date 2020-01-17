class Solution {
    public String reverseWords(String s) {
        String[] line=s.split(" ");
        StringBuffer res=new StringBuffer();
        
        for(int i=0;i<line.length;i++){
            StringBuffer temp=new StringBuffer(line[i]);
            
            res.append(temp.reverse());
            
            if(i!=line.length-1){
                res.append(" ");
            }
        }
            
        return res.toString();
    }
}
