class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] res=new int[2];
        
        int currentWidth=0, numLines=1;
        
        for(char c: S.toCharArray()){
            int charWidth=widths[c-97];
            
            if(charWidth+currentWidth>100){
                currentWidth=0;
                numLines++;
            }
            
            currentWidth+=charWidth;
        }
        
        res[0]=numLines;
        res[1]=currentWidth;
        
        return res;
    }
}