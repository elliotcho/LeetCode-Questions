class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        
        for(int i: A){
            sum+=i;
        }
        
        int avg = sum/3;
        
        int count = 0;
        int sectionSum = 0;
        
        for(int i: A){
            sectionSum+=i;
            
            if(sectionSum == avg){
                count++;
                sectionSum = 0;
            }
        }
        
        return count>=3 && sum%3 == 0;
    }
}