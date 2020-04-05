class LRUCache {
    ListNode head=new ListNode();
    ListNode tail=new ListNode();
    Map<Integer, ListNode> map=new HashMap<>();
    int capacity;
    

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        ListNode node=map.get(key);
        
        if(node!=null){
            remove(node);
            prepend(node);
            return node.val;
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        ListNode node=map.get(key);
        
        if(node!=null){
            remove(node);
            node.val=value;
            prepend(node);
        }
        
        else{
            if(map.size()==capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            
            ListNode newNode= new ListNode();
            newNode.key=key;
            newNode.val=value;
            
            map.put(key, newNode);
            prepend(newNode);
        }
    }
    
    public void prepend(ListNode node){
        ListNode nextNode=head.next;
        
        node.next=nextNode;
        nextNode.prev=node;
        
        head.next=node;
        node.prev=head;
    }
    
    public void remove(ListNode node){
        ListNode nextNode=node.next;
        ListNode prevNode=node.prev;
        
        nextNode.prev=prevNode;
        prevNode.next=nextNode;
    }
    
    
    class ListNode{
        int key;
        int val;
        ListNode next;
        ListNode prev;
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */