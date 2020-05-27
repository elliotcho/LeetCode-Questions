class Solution {
    public int calculateTime(String keyboard, String word) {
        int res=0;
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0;i<keyboard.length();i++){
            map.put(keyboard.charAt(i), i);
        }
        
        int currPos=0;
        
        for(char c: word.toCharArray()){
            res+=Math.abs(map.get(c)-currPos);
            currPos=map.get(c);
        }
        
        return res;
    }
}