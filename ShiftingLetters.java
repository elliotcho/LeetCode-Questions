class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder res = new StringBuilder(S);
        
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i] = (shifts[i] + shifts[i+1])% 26;
        }
        
        for(int i=0;i<shifts.length;i++){  
            int ascii = (int) res.charAt(i);
            
            ascii = ((ascii - 97) + shifts[i])%26;
        
            res.setCharAt(i, (char)(ascii + 97));
        }
        
        return res.toString();
    }
}