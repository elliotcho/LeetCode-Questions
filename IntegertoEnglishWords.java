class Solution {
    String[] belowTen={"", "One", "Two", "Three", "Four",
                      "Five", "Six", "Seven", "Eight", "Nine"};
    
    String[] belowTwenty={"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                         "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    
    String[] belowHundred={"", "Ten", "Twenty", "Thirty", "Forty",
                          "Fifty", "Sixty", "Seventy","Eighty", "Ninety"};
    
    public String numberToWords(int num) {    
        if(num==0){
            return "Zero";
        }
        
        return constructWords(num);
    }
    
    public String constructWords(int num){
        StringBuilder res=new StringBuilder();
        
        if(num<10){res.append(belowTen[num]);}
        else if(num<20){res.append(belowTwenty[num-10]);}
        else if(num<100){res.append(belowHundred[num/10] + " " + belowTen[num%10]);}
        else if(num<1000){res.append(constructWords(num/100)+ " Hundred " + constructWords(num%100));}
        else if(num<1000000){res.append(constructWords(num/1000)+ " Thousand " +constructWords(num%1000));}
        else if(num<1000000000){res.append(constructWords(num/1000000) + " Million " +constructWords(num%1000000));}
        else{res.append(constructWords(num/1000000000) + " Billion " +constructWords(num%1000000000));}
        
        return res.toString().trim();
    }
}