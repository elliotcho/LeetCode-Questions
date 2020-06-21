class Solution {
    public String[] getFolderNames(String[] names) {
        String[] res=new String[names.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<names.length;i++){
            if(!map.containsKey(names[i])){
                res[i]=names[i];
                map.put(names[i], 1);
            }
            
            else{
                int k=map.get(names[i]);
                
                StringBuilder sb=new StringBuilder(names[i]);
                
                sb.append('(');
                sb.append(k);
                sb.append(')');
                
                while(map.containsKey(sb.toString())){
                    k++;
                    
                    sb=new StringBuilder(names[i]);
                    
                    sb.append('(');
                    sb.append(k);
                    sb.append(')');
                }
                
                String newName=sb.toString();
                
                res[i]=newName;
                map.put(names[i], k);
                map.put(newName, 1);
            }
        }
        
        return res;
    }
}