class Solution {
    public String addStrings(String num1, String num2) {
        int ptr1=num1.length()-1;
        int ptr2=num2.length()-1;
        
        StringBuilder res=new StringBuilder();
        
        int sum=0;
        int carry=0;
        
        while(ptr1>=0 || ptr2>=0){
            int digit1= ptr1<0? 0: (int)(num1.charAt(ptr1)-'0');
            int digit2= ptr2<0? 0: (int)(num2.charAt(ptr2)-'0');
            
            sum=digit1+digit2+carry;  

            res.append(sum%10);
            carry=sum/=10;
            
            ptr1--;
            ptr2--;
        }
        
        if(carry!=0){
            res.append(carry);
        }
        
        return res.reverse().toString();
    }
}