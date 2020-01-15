class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] table=new int[days[days.length-1]+1];
        table[0]=0;
        
        HashSet<Integer> searchDay=new HashSet<>();
        for(int i:days){searchDay.add(i);}
        
        for(int j=1;j<table.length;j++){
            if(searchDay.contains(j)){
                int oneD=table[Math.max(0, j-1)]+ costs[0];
                int sevenD=table[Math.max(0, j-7)]+ costs[1];
                int thirtyD=table[Math.max(0, j-30)]+ costs[2];
                table[j]=Math.min(oneD, Math.min(sevenD, thirtyD));
            }
            
            else{
                table[j]=table[j-1];    
            }
        }
        
        return table[table.length-1];
    }
}