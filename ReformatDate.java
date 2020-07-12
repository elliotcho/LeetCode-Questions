class Solution {
    public String reformatDate(String date) {
        StringBuilder res = new StringBuilder();
        
        HashMap<String, String> map = new HashMap<>();
        fillMap(map);
        
        String[] split = date.split(" ");
    
        res.append(split[2]);
        res.append('-');
           
        res.append(map.get(split[1]));
        res.append('-');
        
          if(Character.isDigit(split[0].charAt(1))){
            res.append(split[0].substring(0, 2));
        }
           
        else{
            res.append("0" + split[0].substring(0,1));
        }
           
        return res.toString();
    }
           
    private void fillMap(Map<String,String> map){
        map.put("Jan", "01");  map.put("Jul", "07");
        map.put("Feb", "02");  map.put("Aug", "08");
        map.put("Mar", "03");  map.put("Sep", "09");
        map.put("Apr", "04");  map.put("Oct", "10");
        map.put("May", "05");  map.put("Nov", "11");
        map.put("Jun", "06");  map.put("Dec", "12");
    }
}