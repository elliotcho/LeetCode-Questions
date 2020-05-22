class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){return new int[0];}
        
        int[] res=arr.clone();
        HashMap<Integer, Integer> rankMap=new HashMap<>();
        
        Arrays.sort(arr);
        rankMap.put(arr[0], 1);
        
        int rank=1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                rankMap.put(arr[i], rank);
            }
            
            else{
                rankMap.put(arr[i], ++rank);
            }
        }
        
        for(int i=0;i<res.length;i++){
            res[i]=rankMap.get(res[i]);
        }
        
        return res;
    }
}