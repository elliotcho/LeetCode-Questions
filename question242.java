class Solution {
    public boolean isAnagram(String s, String t) {
        if(makeCode(s)==makeCode(t)){return true;}
        else{return false;}
    }
    
    public int makeCode(String s){
        int[] bucket=new int[26];
        
        for(int i=0;i<s.length();i++){
            bucket[s.charAt(i)-97]++;
        }
        
        return Arrays.hashCode(bucket);
    }
    
}