class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0){return 0;}
        
        int[][] table=new int[matrix.length][matrix[0].length];
        
        int res=0;
        
        for(int a=0;a<table.length;a++){
            table[a][0]=(int)(matrix[a][0]-'0');
            res=Math.max(table[a][0], res);
        }
        
        for(int b=0;b<table[0].length;b++){
            table[0][b]=(int)(matrix[0][b]-'0');
            res=Math.max(table[0][b], res);
        }
        
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[0].length;j++){
                if(matrix[i][j]=='1'){
                    int temp=Math.min(table[i-1][j], table[i-1][j-1]);
                    table[i][j]=Math.min(temp,table[i][j-1])+1;
                }
                
                res=Math.max(table[i][j], res);
            }
        }
      
        return res*res;
    }
}
