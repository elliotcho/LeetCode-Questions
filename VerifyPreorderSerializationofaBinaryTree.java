class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] split=preorder.split(",");
        
        int nodes=1;
        
        for(String s: split){
            nodes--;
            
            if(nodes<0){return false;}
            
            if(!s.equals("#")){nodes+=2;}
        }
        
        return nodes==0;
    }
}