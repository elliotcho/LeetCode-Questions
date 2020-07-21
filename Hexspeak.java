class Solution {
    public String toHexspeak(String num) {
        StringBuilder res = new StringBuilder();
        
        HashMap<Integer, Character> map = new HashMap<>();
        fillMap(map);
    
        long N = Long.parseLong(num);
        
        while(N > 0){
            int digit = (int)(N%16);
            
            if(!map.containsKey(digit)){
                return "ERROR";
            }
            
            res.append(map.get(digit));
            
            N/=16;
        }
        
        return res.reverse().toString();
    }
    
    private void fillMap(HashMap<Integer, Character> map){
        map.put(0, 'O'); map.put(1, 'I');
        map.put(10, 'A'); map.put(11, 'B');
        map.put(12, 'C'); map.put(13, 'D');
        map.put(14, 'E'); map.put(15, 'F');
    }
}