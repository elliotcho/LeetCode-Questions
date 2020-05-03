// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    LinkedList<Integer> queue;
    
	public PeekingIterator(Iterator<Integer> iterator) {
        queue=new LinkedList<>();
        
        while(iterator.hasNext()){
            queue.add(iterator.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return queue.size()==0? null: queue.getFirst();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return queue.size()==0? null: queue.remove();
	}
	
	@Override
	public boolean hasNext() {
	    return queue.size()>0;
	}
}