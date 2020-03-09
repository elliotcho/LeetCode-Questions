class Solution {
    public int lengthOfLastWord(String s) {
        String[] sentence=s.split(" ");
        
        if(sentence.length==0){return 0;}
        
        return sentence[sentence.length-1].length();
    }
}