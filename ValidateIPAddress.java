class Solution {
    public String validIPAddress(String IP) {
        if(isIPv4(IP)){
            return "IPv4";
        }
        
        if(isIPv6(IP)){
            return "IPv6";
        }
        
        return "Neither";
    }
    
    private boolean isIPv4(String IP){
        int periods=0;
        
        for(char c: IP.toCharArray()){
            if(c=='.'){periods++;}
        }
        
        if(periods!=3){return false;}
        
        String[] split=IP.split("\\.");
        
        if(split.length!=4){return false;}
        
        for(String s: split){
            if(s.length()>3 || s.length()==0){
                return false;
            }
            
            for(char c: s.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            
            //handle leading zeros
            int i=Integer.valueOf(s);
            
            if(!String.valueOf(i).equals(s) || i>255){
                return false;
            }
        }
        
        return true;
    }
    
      private boolean isIPv6(String IP){
        int colons=0;
        
        for(char c: IP.toCharArray()){
            if(c==':'){colons++;}
        }
        
        if(colons!=7){return false;}
        
        String[] split=IP.split("\\:");
        
        if(split.length!=8){return false;}
        
        for(String s: split){
            if(s.length()>4 || s.length()==0){
                return false;
            }
            
            for(char c: s.toCharArray()){
                c=Character.toUpperCase(c);
                
                if(!Character.isDigit(c) && (c<'A' || c>'F')){
                    return false;
                }
            }
        }
        
        return true;
    }
}