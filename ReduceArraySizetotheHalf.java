class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i: arr){map.put(i, map.getOrDefault(i,0)+1);}
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=
            new PriorityQueue<>((o1, o2) -> o2.getValue()-o1.getValue());
        
        maxHeap.addAll(map.entrySet());
    
        int size=arr.length, res=0;
        
        while(maxHeap.size()!=0){
            res++;
            
            size-=(int) maxHeap.poll().getValue();
            
            if(size<=arr.length/2){break;}
        }
        
        return res;
    }
}