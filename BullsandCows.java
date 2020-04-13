class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        
        int[] digits=new int[10];
        
        for(int i=0;i<secret.length();i++){
            int s=Character.getNumericValue(secret.charAt(i));
            int g=Character.getNumericValue(guess.charAt(i));
            
            if(s==g){bulls++;}
            
            else{
                digits[s]++;
            }
        }
        
        for(int i=0;i<secret.length();i++){
            int s=Character.getNumericValue(secret.charAt(i));
            int g=Character.getNumericValue(guess.charAt(i));
            
            if(s!=g && digits[g]>0){
                cows++;
                digits[g]--;
            }
        }
        
        StringBuilder res=new StringBuilder();
        
        res.append(bulls);
        res.append('A');
        res.append(cows);
        res.append('B');
        
        return res.toString();
    }
}