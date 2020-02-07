class Solution {
    public String decodeString(String s) {
        int[] numbers=new int[s.length()]; int numTop=-1;
        
        String[] saved=new String[s.length()]; int sTop=-1;
        
        String res=""; 
        
        int i=0;
       
        while(i<s.length()){
            char c=s.charAt(i);
            
            if(Character.isDigit(c)){
                int currentNum=0;
                
                while(Character.isDigit(s.charAt(i))){
                    currentNum=currentNum*10+(int)(s.charAt(i)-'0');
                    i++;
                }
                
                numTop++; numbers[numTop]=currentNum;
            }
            
            else if(c=='['){
                sTop++; saved[sTop]=res;
                
                res="";
                
                i++;
            }
            
            else if(c==']'){
                StringBuilder temp=new StringBuilder(saved[sTop--]);
                
                int count=numbers[numTop--];
                
                for(int j=0;j<count;j++){temp.append(res);}
                
                res=temp.toString();
                
                i++;
            }
            
            else{
                res+=c;
                i++;
            }
        }
        
        return res;
    }
}