class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        
        int start = 0;
        int end = 0;
        
        while(end<chars.length){
            while(end<chars.length && chars[end]==chars[start]){
                end++;
            }
            
            chars[idx++] = chars[start];
            
            if(end - start > 1){
                String count = String.valueOf(end - start);
                
                for(char c: count.toCharArray()){
                    chars[idx++] = c;
                }
            }
            
            start = end;
        }
        
        return idx;
    }
}