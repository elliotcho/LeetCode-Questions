class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        ArrayList<String> res=new ArrayList<>();
        
        int[] max_bucket=new int[26];
        
        for(String b: B){
            int[] curr_bucket=makeBucket(b);
            
            for(int i=0;i<max_bucket.length;i++){
                max_bucket[i]=Math.max(max_bucket[i], curr_bucket[i]);
            }
        }
        
        for(String a: A){
            boolean addToList=true;
            int[] word_bucket=makeBucket(a);
            
            for(int i=0;i<max_bucket.length;i++){
                if(max_bucket[i]>word_bucket[i]){
                    addToList=false;
                    break;
                }    
            }
            
            if(addToList){res.add(a);}
        }
        
        return res;
    }
    
    public int[] makeBucket(String s){
        int[] res=new int[26];
        
        for(char c: s.toCharArray()){res[c-97]++;}
        
        return res;
    }
}