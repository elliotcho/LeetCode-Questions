class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        LinkedList<Integer> queue=new LinkedList<>();
        
        Arrays.sort(deck);    
        
        queue.add(deck[deck.length-1]);
        
        for(int i=deck.length-2;i>=0;i--){
            int temp=queue.removeLast();
            queue.addFirst(temp);
            queue.addFirst(deck[i]);
        }
        
        int[] res=new int[queue.size()];
        
        for(int i=0;i<res.length;i++){res[i]=queue.get(i);}
        
        return res;
    }
}