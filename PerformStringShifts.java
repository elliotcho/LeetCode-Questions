class Solution {
    public String stringShift(String s, int[][] shift) {
        int totalShifts=0;
        
        for(int[] move: shift){
            if(move[0]==0){totalShifts-=move[1];}
            if(move[0]==1){totalShifts+=move[1];}
        }
        
        totalShifts=totalShifts%s.length();
        
        if(totalShifts==0){return s;}
        
        if(totalShifts>0){
            return rightShift(s, totalShifts);
        }
        
        return leftShift(s, totalShifts*-1);
    }
    
    private String rightShift(String s, int k){
        char[] arr=s.toCharArray();
        
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        
        return String.valueOf(arr);
    }
    
    private String leftShift(String s, int k){
        char[] arr=s.toCharArray();
        
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        
        return String.valueOf(arr);
    }
    
    private void reverse(char[] arr, int i, int j){
        while(i<j){
            swap(arr, i++, j--);
        }
    }
    
    private void swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}