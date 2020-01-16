class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] bucket=new int[26];
        for(int i=0;i<chars.length();i++){
            bucket[chars.charAt(i)-97]++;
        }
        
        int res=0;
        for(int i=0;i<words.length;i++){
            if(compare(words[i], bucket)){res+=words[i].length();}
        }
        
        return res;
    }
    
    public boolean compare(String s, int[] bucket){
        int[] temp=new int[26];
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            
            if(bucket[c-97]==temp[c-97]){
                return false;
            }
            
            else{
                temp[c-97]++;
            }
        }
        
        return true;
    }
}