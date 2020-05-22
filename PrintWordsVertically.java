class Solution {
    public List<String> printVertically(String s) {
        ArrayList<String> res=new ArrayList<>();
        ArrayList<StringBuilder> builders=new ArrayList<>();
        
        String[] split=s.split(" ");
        
        int max=0;
        
        for(String word: split){
            max=Math.max(max, word.length());
        }
        
        for(int i=0;i<max;i++){
            for(String word: split){
                if(builders.size()==i){
                    builders.add(new StringBuilder());
                }
                
                if(i<word.length()){
                    builders.get(i).append(word.charAt(i));
                }
                
                else{
                    builders.get(i).append(' ');
                }
            }
        }
        
        for(StringBuilder sb: builders){
            int i=sb.length()-1;
            
            while(sb.charAt(i)==' '){
                sb.deleteCharAt(sb.length()-1);
                i--;
            }
            
            res.add(sb.toString());
        }
        
        return res;
    }
}