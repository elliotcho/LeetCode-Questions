class Solution {
    public int numTilePossibilities(String tiles) {
        int[] res={0};
        
        char[] arr=tiles.toCharArray();
        
        Arrays.sort(arr);
        
        backtrack(res, arr, new boolean[arr.length], 0);
        
        return res[0];
    }
    
    private void backtrack(int[] res, char[] arr, boolean[] used, int start){
        if(start==arr.length){
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(used[i] || (i>0 && !used[i-1] && arr[i]==arr[i-1])){continue;}
            
            res[0]++;
            
            used[i]=true;
            backtrack(res, arr, used, start+1);
            used[i]=false;
        }
    }
}