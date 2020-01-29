class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] bucket=new int[26];
        for(int i=0;i<text.length();i++){
            bucket[text.charAt(i)-97]++;
        }
        
        int res=0;
        while(bucket['b'-97]>0 && bucket['a'-97]>0 &&
             bucket['l'-97]>1 && bucket['o'-97]>1 && bucket['n'-97]!=0){
            
            bucket['b'-97]--;
            bucket['a'-97]--;
            bucket['l'-97]=bucket['l'-97]-2;
            bucket['o'-97]=bucket['o'-97]-2;
            bucket['n'-97]--;
            
            res++;
        }
        
        return res;
    }
}
