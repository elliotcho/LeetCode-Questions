class Solution {
    public String generateTheString(int n) {
        StringBuilder res=new StringBuilder();
        
        int length=n;
        
        while(length>1){
            res.append('a');
            length--;
        }
        
        //if n is even, then n - 1 is odd, so we add a new character 'b'
        if(n%2==0){res.append('b');}
        
        //if n is odd, then n - 1 is even, so we add the same character 'a'
        if(n%2!=0){res.append('a');}
        
        return res.toString();
    }
}