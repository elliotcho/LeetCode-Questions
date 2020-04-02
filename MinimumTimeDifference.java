class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] time_bucket=new boolean[24*60];
        
        for(String time: timePoints){
            String[] t_split=time.split(":");
            
            int hours=Integer.parseInt(t_split[0]);
            int minutes=Integer.parseInt(t_split[1]);
            
            if(time_bucket[hours*60+minutes]){return 0;}
            
            time_bucket[hours*60+minutes]=true;
        }
        
        int first_time=-1;
        int prev_time =-1;
        int res=Integer.MAX_VALUE;
        
        for(int i=0;i<time_bucket.length;i++){
            if(time_bucket[i]){
                if(first_time==-1){
                    first_time=i;
                    prev_time=i;
                }
                
                else{
                    int temp=Math.min(res, i-prev_time);
                    res=Math.min(temp, 1440-i+prev_time);
                    prev_time=i;
                }
            }
        }
        
        int temp=Math.min(res, prev_time-first_time);
        res=Math.min(temp, 1440-prev_time+first_time);
        
        return res;
    }
}