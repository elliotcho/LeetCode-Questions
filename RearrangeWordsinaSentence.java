class Solution {
    public String arrangeWords(String text) {
        PriorityQueue<Word> pq=new PriorityQueue<>((w1, w2)->
            (w1.text.length()==w2.text.length())? w1.order-w2.order: w1.text.length()-w2.text.length()               
        );
        
        String[] split=text.split(" ");
        
        for(int i=0;i<split.length;i++){
            pq.add(new Word(split[i].toLowerCase(), i));
        }
        
        StringBuilder res=new StringBuilder();
        
        while(!pq.isEmpty()){
            if(res.length()==0){
                res.append(pq.poll().text+" ");
                res.setCharAt(0, Character.toUpperCase(res.charAt(0)));
            }
            
            else{
                res.append(pq.poll().text+" ");
            }
        }
        
        res.deleteCharAt(res.length()-1);
        
        return res.toString();
    }
    
    class Word{
        String text;
        int order;
        
        Word(String text, int order){
            this.text=text;
            this.order=order;
        }
    }
}