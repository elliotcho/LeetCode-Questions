class Solution {
    public int findComplement(int num) {
        int complement=0, exp=0;
        
        while(complement<num){
            complement+=Math.pow(2, exp++);
        }
        
        return complement-num;
    }
}