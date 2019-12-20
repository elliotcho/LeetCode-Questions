class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> even=new ArrayList<>();    
        ArrayList<Integer> odd=new ArrayList<>();
        int[] res= new int[A.length];
        
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){even.add(A[i]);}
            else{odd.add(A[i]);}  
        }
        
        int k=0;
        for(int i=0; i<even.size();i++){res[k]=even.get(i);k++;}
        for(int j=0;j<odd.size();j++){res[k]=odd.get(j); k++;}
        
        
        
        return res;
    }
}