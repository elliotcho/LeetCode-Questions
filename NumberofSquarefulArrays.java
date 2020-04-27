class Solution {
    public int numSquarefulPerms(int[] A) {
        int[] res={0};
        
        Arrays.sort(A);
        
        backtrack(res, new ArrayList<>(), A, new boolean[A.length]);
        
        return res[0];
    }
    
    private void backtrack(int[] res, List<Integer> memo, int[] A, boolean[] used){
        if(memo.size()==A.length){
            res[0]++; 
            return;
        }
        
        int m=memo.size();
        
        for(int i=0;i<A.length;i++){
            if(used[i]){continue;}
            
            if(i>0 && A[i]==A[i-1] && !used[i-1]){continue;}
            
            if(m>0 && !isSquareful(memo.get(m-1)+ A[i])){continue;}
            
            memo.add(A[i]);
            used[i]=true;
            
            backtrack(res, memo, A, used);
            
            memo.remove(memo.size()-1);
            used[i]=false;
        }
    }
    
    private boolean isSquareful(int num){
        return (Double) Math.sqrt(num)== (int) Math.sqrt(num);
    }
}