class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set=new HashSet<>();
        
        int[] bucket=new int[26];
        Arrays.fill(bucket, -1);
        
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                bucket[s.charAt(i)-97]=-1;
            }
            
            else{
                set.add(s.charAt(i));
                bucket[s.charAt(i)-97]=i;
            }
        }
        
        int res=-1, flag=0;
        
        for(int k=0;k<bucket.length;k++){
            if(bucket[k]==-1){continue;}
            
            else{
                if(flag==0){
                    res=bucket[k];
                    flag=1;
                }
                
                else{
                    res=Math.min(res, bucket[k]);
                }
            }
        }
        
        return res;
    }
}