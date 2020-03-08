class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res=new LinkedList<>();
        
        if(digits.length()==0){return res;}
        
        res.add("");
        
        String[] map={"0", "1", "abc", "def", "ghi", "jkl",
                     "mno", "pqrs", "tuv", "wxyz"};
        
        
        for(int i=0;i<digits.length();i++){
            int num=Character.getNumericValue(digits.charAt(i));
            
            while(res.getFirst().length()==i){
                StringBuilder temp=new StringBuilder(res.remove());
                
                for(char c: map[num].toCharArray()){
                    temp.append(c);
                    
                    res.add(temp.toString());
                    
                    temp.deleteCharAt(temp.length()-1);
                }
            }
        }
        
        return res;
    }
}