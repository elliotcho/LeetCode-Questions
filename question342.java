class Solution {
    public boolean isPowerOfFour(int num) {
        if(num==0){return false;}
        if(num==1){return true;}
        double res=Math.log(num)/Math.log(4);
        return res==Math.floor(res);
    }
}