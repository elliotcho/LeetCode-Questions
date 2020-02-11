class Solution {
    public boolean hasAlternatingBits(int n) {
        String binaryNum=Integer.toBinaryString(n);
        
        for(int i=1;i<binaryNum.length();i++){
            if(binaryNum.charAt(i)==binaryNum.charAt(i-1)){
                return false;
            }
        }
        
        return true;
    }
}