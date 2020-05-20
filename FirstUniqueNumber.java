class FirstUnique {
    ListNode head;
    ListNode tail;
    HashMap<Integer, ListNode> map;

    public FirstUnique(int[] nums) {
        head=new ListNode(-1);
        tail=new ListNode(-1);
        
        head.next=tail;
        tail.prev=head;
        
        map=new HashMap<>();
        
        for(int i: nums){
            add(i);
        }
    }
    
    public int showFirstUnique() {
        return head.next.val;
    }
    
    public void add(int value) {
        if(map.containsKey(value)){
            removeNode(map.get(value));
        }
        
        else{
            ListNode newNode=new ListNode(value);
            
            appendNode(newNode);
            
            map.put(value, newNode);
        }
    }
    
    private void appendNode(ListNode node){
        ListNode prevNode=tail.prev;
        
        node.prev=prevNode;
        prevNode.next=node;
        
        node.next=tail;
        tail.prev=node;
    }
    
    private void removeNode(ListNode node){
        if(node.next==null && node.prev==null){
            return;
        }
        
        ListNode nextNode=node.next;
        ListNode prevNode=node.prev;
        
        nextNode.prev=prevNode;
        prevNode.next=nextNode;
        
        node.next=null;
        node.prev=null;
    }
    
    class ListNode{
        int val;
        ListNode prev;
        ListNode next;
        
        ListNode(int val){
            this.val=val;
        }
    }
}
/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */