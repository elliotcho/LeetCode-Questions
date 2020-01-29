class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){map.put(arr[i], 1);}
            else{
                int count=map.get(arr[i])+1;
                map.replace(arr[i], count);
            }
        }
        
        Iterator iter=map.entrySet().iterator();
        int[] occurences=new int[map.size()];
        int k=0;
        
        while(iter.hasNext()){
            Map.Entry entry= (Map.Entry) iter.next();
            occurences[k]=(int) entry.getValue();
            k++;
        }
        
        Arrays.sort(occurences);
        
        for(int i=1;i<occurences.length;i++){
            if(occurences[i]==occurences[i-1]){
                return false;
            }
        }
        
        return true;
    }
}
