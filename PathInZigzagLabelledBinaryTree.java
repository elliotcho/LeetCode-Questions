class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> res = new LinkedList<>();
        
        res.addFirst(label);
        
        while(label!=1){
            int level = (int) (Math.log(label)/Math.log(2));
            
            int offset = (int)Math.pow(2, level+1) - 1 - label;
            
            label = ((int)Math.pow(2, level) + offset)/2;
            
            res.addFirst(label);
        }
        
        return res;
    }
}