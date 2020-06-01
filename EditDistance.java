class Solution {
    public int minDistance(String word1, String word2) {
        int[][] table=new int[word1.length()+1][word2.length()+1];
        
        for(int i=1;i<table.length;i++){
            table[i][0]=i;
        }
        
        for(int j=1;j<table[0].length;j++){
            table[0][j]=j;
        }
        
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[i].length;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    table[i][j]=table[i-1][j-1];
                }
                
                else{
                    table[i][j]=Math.min(table[i-1][j], Math.min(table[i][j-1], table[i-1][j-1]))+1;
                }
            }
        }
        
        return table[word1.length()][word2.length()];
    }
}