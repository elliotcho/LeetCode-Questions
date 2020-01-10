class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] table=new boolean[s.length()+1][p.length()+1];
        table[0][0]=true;
        
        for(int j=1;j<table[0].length;j++){
            if(p.charAt(j-1)=='*'){
                table[0][j]=table[0][j-1];
            }
            
            else{
                break;
            }
        }
        
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[0].length;j++){
		if(p.charAt(j-1)=='?' || 
                   p.charAt(j-1)==s.charAt(i-1)){
                    table[i][j]=table[i-1][j-1];
                }

                if(p.charAt(j-1)=='*'){
                    table[i][j]=table[i-1][j] || table[i][j-1];
                }
            }
        }
        
        
        return table[s.length()][p.length()];
    }
}