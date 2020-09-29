class Solution {
    public String simplifyPath(String path) {
        StringBuilder res = new StringBuilder();
        Stack<String> stack = new Stack<>();
        
        String[] split = path.split("/");
        
        for(String dir: split){
            if(dir.length() == 0){
                continue;
            }
            
            else if(dir.equals(".")){
                continue;
            }
            
            else if(dir.equals("..")){
                if(stack.size() > 0){
                    stack.pop();
                }
            }
            
            else{
                stack.push(dir);
            }
        }
        
        Stack<String> tempStack = new Stack<>();
        
        while(!stack.isEmpty()){
            tempStack.push(stack.pop());
        }
        
        while(!tempStack.isEmpty()){
            res.append("/" + tempStack.pop());
        }
        
        return res.length() == 0? "/" : res.toString();
    }
}