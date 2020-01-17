class Solution {
    public int addDigits(int num) {
        if(num>=10){
            if(num%9!=0){
                return num%9;
            }
            
            else{
                return 9;
            }
        }
        
        else{
            return num;
        }
    }
}