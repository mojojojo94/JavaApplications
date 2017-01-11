
package queue;

import java.util.LinkedList;
import java.util.Stack;

public class GenericQueue<D> {
    
    LinkedList<D> queue;
    
    // Making a queue instance
    public GenericQueue() {
        queue = new LinkedList();
    }
    
    // Is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // What is the size of our queue?
    public int size() {
        return queue.size();
    }
    
    // Enqueuing an item
    public void enqueue(D n) {
        queue.addLast(n);
    }
    
    // Dequeuing an item
    public D dequeue() {
        return queue.remove(0);
    }
    
    // Peek at the first item
    public D peek() {
        return queue.get(0);
    }

}
