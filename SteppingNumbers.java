class Solution {
    public List<Integer> countSteppingNumbers(int low, int high) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(low == 0){res.add(0);}
        
        LinkedList<Long> queue = new LinkedList<>();
        
        for(long i=1; i<=9;i++){
            queue.add(i);
        }
    
        while(!queue.isEmpty()){
            long curr = queue.remove();
            
            if(curr < high){
                long mod = curr % 10;
                
                if(mod > 0){queue.add(curr*10 + mod - 1);}
                if(mod < 9){queue.add(curr*10 + mod + 1);}
            }
            
            if(curr>= low && curr<=high){
                res.add((int) curr);
            }
        }
        
        return res;
    }
}