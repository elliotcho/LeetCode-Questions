class TwoSum {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    
    /** Initialize your data structure here. */
    public TwoSum() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(map.containsKey(number)){
            map.put(number, map.get(number)+1);
        }
        
        else{
            list.add(number);
            map.put(number, 1);
        }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
       for(int i=0;i<list.size();i++){
           int num1=list.get(i);
           int num2=value-num1;
           
           if(num1==num2 && map.get(num1)>1){
               return true;
           }
           
           if(num1!=num2 && map.containsKey(num2)){
               return true;
           }
       }
        
       return false;
    }
}
/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */