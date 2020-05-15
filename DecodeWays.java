class Solution {
    public int numDecodings(String s) {
        if(s.length()==0){return 1;}
        
        int[] table=new int[s.length()+1];
        
        table[0]=1;
        table[1]=s.charAt(0)=='0'? 0: 1;
        
        for(int i=2;i<table.length;i++){
            int lastDigit=Integer.valueOf(s.substring(i-1, i));
            int lastTwoDigits=Integer.valueOf(s.substring(i-2, i));
            
            if(lastDigit>0 && lastDigit<10){
                table[i]+=table[i-1];
            }
            
            if(lastTwoDigits>=10 && lastTwoDigits<=26){
                table[i]+=table[i-2];
            } 
        }
        
        return table[s.length()];
    }
}