//Every perfect square is a sum of a series of odd numbers
//1 = 1
//4 = 1 + 3
//9 = 1 + 3 + 5
//16 =1 + 3 + 5 + 7
//...

class Solution {
    public boolean isPerfectSquare(int num) {
        int oddNum=1;
        
        while(num>0){
           num-=oddNum;
           oddNum+=2;
        }
        
        return num==0;
    }
}