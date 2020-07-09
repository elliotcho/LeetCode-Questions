class Solution {
    public String smallestSubsequence(String text) {
        StringBuilder  res = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> seen = new HashSet<>();
        
        for(char c: text.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        
        for(char c: text.toCharArray()){
            if(seen.contains(c)){
                map.put(c, map.get(c) - 1);
            }
            
            else{
                while(!stack.isEmpty() && map.get(stack.peek()) > 1 && stack.peek() > c){
                    map.put(stack.peek(), map.get(stack.peek()) - 1);
                    seen.remove(stack.pop());
                }
                
                stack.push(c);
                seen.add(c);
            }
        }
        
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        return res.reverse().toString();
    }
}