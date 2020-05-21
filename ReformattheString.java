class Solution {
    public String reformat(String s) {
        StringBuilder res=new StringBuilder();
        
        LinkedList<Character> chars=new LinkedList<>();
        LinkedList<Character> nums=new LinkedList<>();
        
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                nums.add(c);
            }
            
            else{
                chars.add(c);
            }
        }
        
        if(chars.size()>nums.size()){
            while(nums.size()!=0){
                res.append(chars.remove());
                res.append(nums.remove());
            }
            
            if(chars.size()>0){res.append(chars.remove());}
            
            return chars.size()==0? res.toString(): "";
        }
        
        while(chars.size()!=0){
            res.append(nums.remove());
            res.append(chars.remove());
        }
        
        if(nums.size()>0){res.append(nums.remove());}
        
        return nums.size()==0? res.toString(): "";
    }
}