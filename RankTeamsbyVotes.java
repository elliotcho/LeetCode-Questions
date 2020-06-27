class Solution {
    public String rankTeams(String[] votes) {
        int[][] votesBucket =new int[26][26];
        
        for(String vote: votes){
            for(int i=0;i<vote.length();i++){
                votesBucket[vote.charAt(i)-65][i]++;
            }
        }
       
        char[] res = votes[0].toCharArray();
        
        Character[] tmp = new Character[res.length];
        
        for(int i=0;i<res.length;i++){tmp[i]=res[i];}
        
        Arrays.sort(tmp, (c1, c2) -> {
            for(int i=0;i<26;i++){
                if(votesBucket[c1-65][i] > votesBucket[c2-65][i]){
                    return -1;
                }
                
                else if(votesBucket[c1-65][i] < votesBucket[c2-65][i]){
                    return 1;
                }
                
                else{
                    continue;
                }
            }
            
            return c1-c2;
        });
        
        for(int i=0;i<res.length;i++){res[i]=tmp[i];}
        
        return String.valueOf(res);
    }
}