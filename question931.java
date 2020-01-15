class Solution {
    public int minFallingPathSum(int[][] A) {
        int[][] table=new int[A.length][A[0].length];
   
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[0].length;j++){
                table[i][j]=A[i][j];
                
                if(i!=0 && j==0){
                    table[i][j]+=Math.min(table[i-1][j], table[i-1][j+1]);
                }
                
                else if(i!=0 && j==A[0].length-1){
                    table[i][j]+=Math.min(table[i-1][j], table[i-1][j-1]);
                }
                
                else if(i!=0 && j!=0 && j!=A[0].length-1){
                    table[i][j]+=Math.min(table[i-1][j], Math.min(table[i-1][j-1],table[i-1][j+1]));
                }
            }
        }
        
        int res=101;
        for(int k=0;k<table[0].length;k++){
            res=Math.min(table[table.length-1][k],res);
        }
        
        return res;
    }
}