class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res=new StringBuilder();
        
        for(int i=s.length()-1;i>=0;i--){            
            if(s.charAt(i)=='#'){
                int tens=Character.getNumericValue(s.charAt(i-2))*10;
                
                int ones=Character.getNumericValue(s.charAt(i-1));
                
                res.append((char)(tens+ones+96));
            
                i-=2;
            }
            
            else{
                int num=Character.getNumericValue(s.charAt(i));
                res.append((char)(num+96));
            }
        }
        
        return res.reverse().toString();
    }
}