class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder res = new StringBuilder();
        
        char[] stack = new char[s.length()];
        int top = -1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> seen = new HashSet<>();
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char c: s.toCharArray()){
            if(seen.contains(c)){
                map.put(c, map.get(c)-1);
                continue;
            }
            
            while(top!=-1 && stack[top] > c && map.get(stack[top]) > 1){
                map.put(stack[top], map.get(stack[top]) - 1);
                seen.remove(stack[top--]);
            }
            
            stack[++top] = c;
            seen.add(c);
        }
        
        while(top!=-1){
            res.append(stack[top--]);
        }
        
        return res.reverse().toString();
    }
}