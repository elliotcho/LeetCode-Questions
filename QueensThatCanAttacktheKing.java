class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[][] seen=new boolean[8][8];
        
        for(int[] q: queens){
            seen[q[0]][q[1]]=true;
        }
        
        int[] directions={-1,0,1};
        for(int i=0;i<directions.length;i++){
            for(int j=0;j<directions.length;j++){
                if(i==1 && j==1){j++;}
                
                int x=king[0];
                int y=king[1];
                
                while(x+directions[i]>=0 && x+directions[i]<8 
                      && y+directions[j]>=0 && y+directions[j]<8){
                    x+=directions[i];
                    y+=directions[j];
                    
                    if(seen[x][y]==true){
                        res.add(Arrays.asList(x, y));
                        break;
                    }
                }   
            }
        }
        
        return res;
    }
}
