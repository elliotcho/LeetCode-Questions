class Solution {
    public String removeDuplicates(String s, int k) {
        char[] chars=new char[s.length()]; int charsTop=-1;
        int[] count=new int[s.length()]; int countTop=-1;
        
        for(char c: s.toCharArray()){
            if(charsTop==-1){
                chars[++charsTop]=c;
                count[++countTop]=1;
            }
            
            else if(charsTop!=-1){
                if(chars[charsTop]==c){count[countTop]++;}
                
                else{count[++countTop]=1;}
                
                chars[++charsTop]=c;
            }
                    
            if(count[countTop]==k){
                for(int i=0;i<k;i++){charsTop--;}
                countTop--;
            }
        }
        
        StringBuilder res=new StringBuilder();
        
        for(int i=charsTop;i>=0;i--){res.append(chars[charsTop--]);}
        
        return res.reverse().toString();
    }
}