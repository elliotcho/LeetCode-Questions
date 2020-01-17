class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(Character.isDigit(c) || Character.isLetter(c)){
                sb.append(c);
            }
        }
        
        String forward=sb.toString().toLowerCase();
        String reversed=sb.reverse().toString().toLowerCase();
        
        return reversed.equals(forward);
    }
}