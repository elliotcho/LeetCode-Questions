class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char res = ' ';
        
        int maxTime = -1;
        
        for(int i=0;i<releaseTimes.length;i++){
            int time = releaseTimes[i];
            char c = keysPressed.charAt(i);
          
            if(i > 0){
                time = releaseTimes[i] - releaseTimes[i - 1];
            }
            
            if(time > maxTime || (time == maxTime && res < c)){
                maxTime = time;
                res = c;
            }
        }
        
        return res;
    }
}