class Solution {
    public int balancedStringSplit(String s) {
        int count=0, left=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){left++;}
            if(s.charAt(i)=='R'){left--;}
            if(left==0){count++;}
        }
        
        return count;
    }
}