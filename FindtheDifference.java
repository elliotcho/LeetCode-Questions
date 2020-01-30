class Solution {
    public char findTheDifference(String s, String t) {
        int asciiValforS=0, asciiValforT=0;
        
        for(int i=0;i<s.length();i++){
            asciiValforS+=s.charAt(i);
        }
        
        for(int j=0;j<t.length();j++){
            asciiValforT+=t.charAt(j);
        }
        
        return (char) (asciiValforT-asciiValforS);
    }
}
