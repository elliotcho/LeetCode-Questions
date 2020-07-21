class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        if(sb.length() == 0){
            return 0;
        }
        
        else if(s.equals(sb.reverse().toString())){
            return 1;
        }
        
        else{
            return 2;
        }
    }
}