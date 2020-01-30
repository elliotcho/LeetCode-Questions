class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map=new HashMap<>();
        
        String[] senA=A.split(" "); String[] senB= B.split(" ");
       
        String res="";
        
        for(int i=0;i<senA.length;i++){
            if(map.containsKey(senA[i])){map.put(senA[i],1);}
            else{map.put(senA[i], 0);}
        }
        
        for(int j=0;j<senB.length;j++){
            if(map.containsKey(senB[j])){map.put(senB[j],1);}
            else{map.put(senB[j], 0);}
        }
        
        Iterator iter=map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry=(Map.Entry) iter.next();
            
            int val=(int) entry.getValue();
            if(val==0){
                res+=(String) entry.getKey()+" ";
            }
        }
        
        if(!res.equals("")){return res.split(" ");}
        else{return new String[0];}
    }
    
}
