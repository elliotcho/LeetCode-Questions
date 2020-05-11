class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();

        Arrays.sort(words, (a, b)-> a.length()-b.length());
        
        for(int i=0;i<words.length;i++){
            String substr=words[i];
            
            for(int j=words.length-1;j>i;j--){
                if(words[j].contains(substr)){
                    res.add(substr);
                    break;
                }
            }
        }
        
        return res;
    }
}