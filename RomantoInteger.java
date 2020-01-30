class Solution {
    public int romanToInt(String s) {
        int res=0;
        
        for(int i=0;i<s.length()-1;i++){
            int current=getVal(s.charAt(i));
            
            int next=getVal(s.charAt(i+1));
            
            if(current<next){res-=current;}
            
            else{res+=current;}
        }
        
        res+=getVal(s.charAt(s.length()-1));
        
        return res;
    }
    
    public int getVal(char c){
        if(c=='I'){return 1;}
        if(c=='V'){return 5;}
        if(c=='X'){return 10;}
        if(c=='L'){return 50;}
        if(c=='C'){return 100;}
        if(c=='D'){return 500;}
        else{return 1000;}
    }
}