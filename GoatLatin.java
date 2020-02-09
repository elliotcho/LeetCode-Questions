class Solution {
    public String toGoatLatin(String S) {
        String[] line=S.split(" ");
        
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<line.length;i++){
            StringBuilder temp=new StringBuilder(line[i]);
            
            if(isVowel(line[i].charAt(0))){
                temp.append('m');
                for(int j=0;j<=i+1;j++){temp.append('a');}
            }
           
            else{
                char first=temp.charAt(0);
                temp.deleteCharAt(0);
                
                temp.append(first);
                temp.append('m');
                
                for(int j=0;j<=i+1;j++){temp.append('a');}
            }
         
            res.append(temp+" ");
        }
        
        res.deleteCharAt(res.length()-1);
        
        return res.toString();
    }
    
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}