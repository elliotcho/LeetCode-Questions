class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set=new HashSet<>();
        
        String[] code={".-","-...","-.-.","-..",".","..-.",
                       "--.","....","..",".---","-.-",".-..",
                       "--","-.","---",".--.","--.-",".-.","...","-","..-",
                       "...-",".--","-..-","-.--","--.."};
        
        for(String word: words){
            StringBuilder temp=new StringBuilder();
            
            for(char c: word.toCharArray()){
                temp.append(code[c-97]);
            }
            
            set.add(temp.toString());
        }
        
        return set.size();
    }
}