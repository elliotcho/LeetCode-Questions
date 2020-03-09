class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){return "0";}
        
        int[] prod=new int[num1.length()+num2.length()-1];
        
        for(int i=0;i<num1.length();i++){
            for(int j=0;j<num2.length();j++){
                prod[i+j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        
        for(int i=prod.length-1;i>0;i--){
            prod[i-1]+=prod[i]/10;
            prod[i]%=10;
        }
        
        StringBuilder res=new StringBuilder();
        
        for(int i: prod){res.append(i);}
        
        return res.toString();
    }
}