class Solution {
    public List<String> commonChars(String[] A) {
        int[] bucket=new int[26];
        ArrayList<String> res=new ArrayList<>();
        
        
        //first word in set
        for(int i=0;i<A[0].length();i++){
            bucket[A[0].charAt(i)-97]++;
        }
        
        
        //every other word in the set
        for(int j=1;j<A.length;j++){
            int[] tempBucket=new int[26];
            
            for(char c: A[j].toCharArray()){
                 if(bucket[c-97]==0){continue;}
                 
                else{
                    tempBucket[c-97]++;
                    bucket[c-97]--;
                 }                
            }
            
            bucket=tempBucket;
        }
        
        
        //add characters to ArrayList
        for(int k=0;k<bucket.length;k++){
            while(bucket[k]>0){
                char value=(char) (k+97);
                res.add(String.valueOf(value));
                bucket[k]--;
            }
        }
                            
        return res;
   }
}