class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] res=new int[queries.length];
        LinkedList<Integer> permutations=new LinkedList<>();
        
        for(int i=1;i<=m;i++){
            permutations.add(i);
        }
        
        for(int i=0;i<res.length;i++){
            int idx=permutations.indexOf(queries[i]);
            int val=permutations.get(idx);
            
            permutations.remove(idx);
            permutations.addFirst(val);
            
            res[i]=idx;
        }
        
        return res;
    }
}