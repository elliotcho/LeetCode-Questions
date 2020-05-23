class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> res=new ArrayList<>();
        
        int[] bucket1=new int[2001];
        int[] bucket2=new int[2001];
        int[] bucket3=new int[2001];
        
        for(int i: arr1){bucket1[i]++;}
  
        for(int i: arr2){
            if(bucket1[i]>0){
                bucket2[i]++;
                bucket1[i]--;
            }
        }
        
        for(int i: arr3){
            if(bucket2[i]>0){
                bucket3[i]++;
                bucket2[i]--;
                
                res.add(i);
            }
        }
        
        return res;
    }
}