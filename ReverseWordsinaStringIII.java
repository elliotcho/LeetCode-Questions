class Solution {
    public String reverseWords(String s) {
        String[] line=s.split(" ");
        
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<line.length;i++){
            StringBuilder temp=new StringBuilder();
            
            temp.append(line[i]);
            
            res.append(temp.reverse());
            
            if(i!=line.length-1){res.append(" ");}
        }
            
        return res.toString();
    }
}
