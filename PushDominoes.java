class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder res=new StringBuilder();    
        int[] force_array=new int[dominoes.length()];
        int force=0;
        
        for(int i=0;i<dominoes.length();i++){
            if(dominoes.charAt(i)=='L'){force=0;}
            
            else if(dominoes.charAt(i)=='R'){force= dominoes.length();}
            
            else{force=Math.max(0, force-1);}
            
            force_array[i]+=force;
        }
        
        force=0;
        
        for(int i=dominoes.length()-1;i>=0;i--){
            if(dominoes.charAt(i)=='L'){force=dominoes.length();}
            
            else if(dominoes.charAt(i)=='R'){force=0;}
            
            else{force=Math.max(0, force-1);}
            
            force_array[i]-=force;
        }
        
        for(int f: force_array){
            if(f==0){res.append('.');}
            
            else if(f<0){res.append('L');}
            
            else{res.append('R');}
        }
        
        return res.toString();
    }
}