
package linkedlist;

//replaced all int data types with a generic datatype D

public class Node<D> {
    
    Node<D> next;
    D data;
    
    //Methods
    
    //Constructors
    
    public Node(D newData){
        data = newData;
        next = null;
    }
    
    public Node(D newData, Node newNext){
        data = newData;
        next = newNext;
    }
    
    //Getters
    
    public D getData(){
        return data;
    }
    
    public Node<D> getNext(){
        return next;
    }
    
    //Setters
    
    public void setData(D newData){
        data = newData;
    }
    
    public void setNext(Node<D> newNode){
        next = newNode;
    }
}
