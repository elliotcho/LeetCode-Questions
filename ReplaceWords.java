class Solution {
    public String replaceWords(List<String> dict, String sentence) {    
        String[] line=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        
        for(String s: line){
            for(int i=0;i<dict.size();i++){
                if(s.startsWith(dict.get(i))){
                    s=dict.get(i);
                    break;
                }
            }           
            
           res.append(s +" ");
        }
            
        res.deleteCharAt(res.length()-1);
        
        return res.toString();
    }
}
