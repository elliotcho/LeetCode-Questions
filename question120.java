class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0){return 0;}
        
        int dimension=triangle.get(triangle.size()-1).size();
        int[][] table=new int[dimension][dimension];
        Arrays.fill(table[0], Integer.MAX_VALUE);
        
        table[0][0]=triangle.get(0).get(0);
        
        int upper=2;
        for(int i=1;i<table.length;i++){    
            Arrays.fill(table[i], Integer.MAX_VALUE);
            
            for(int j=0;j<upper; j++){
                table[i][j]=triangle.get(i).get(j);
                
                if(j==0){
                    table[i][j]+=table[i-1][j];
                }
                if(j!=0){
                    table[i][j]+=Math.min(table[i-1][j], table[i-1][j-1]);    
                }
            }
            
            upper++;
        }
        
        int res=Integer.MAX_VALUE;
        for(int k=0;k<table[0].length;k++){
            res=Math.min(res,table[table.length-1][k]);
        }
        
        return res;      
    }
}