class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        
        for(int current: asteroids){
            if(stack.isEmpty() || current>0){stack.push(current);}
            
            else{
                while(true){
                    int top=stack.peek();
                    
                    if(top<0){
                        stack.push(current);
                        break;
                    }
                    
                    else if(Math.abs(current)==top){
                        stack.pop();
                        break;
                    }
                    
                    else if(top>Math.abs(current)){
                        break;
                    }
                    
                    else if(Math.abs(current)>top){
                        stack.pop();
                        
                        if(stack.isEmpty()){
                            stack.add(current);
                            break;
                        }
                    }
                }
            }
        }
        
        int[] res=new int[stack.size()];
        
        for(int i=res.length-1;i>=0;i--){res[i]=stack.pop();}
        
        return res;
    }
}