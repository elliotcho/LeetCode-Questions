class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        StringBuilder res=new StringBuilder();
        
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && flag==0){
                res.append('9');
                flag=1;
            }
            
            else{
                res.append(s.charAt(i));
            }
        }
        
        return Integer.valueOf(res.toString());
    }
}