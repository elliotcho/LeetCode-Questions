/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) {return null;}
        
        Node p = head;
        
        while(p!=null){
            if(p.child==null){
                p = p.next;
            }
            
            else{
                Node c = p.child;
                
                while(c.next!=null){
                    c=c.next;
                }
                
                if(p.next != null){
                    c.next = p.next;
                    p.next.prev = c;
                }
                
                p.next = p.child;
                p.child.prev = p;
                p.child = null;
            }
        }
        
        return head;
    }
}