
package linkedlist;

import java.util.LinkedList;

//Introducing generic datatype D
//replaced all int datatype with generics where appropriate and Node class to
//<D>

public class LinkedListS<D> {

    //Properties
    Node<D> head;
    int count;
    
    //Constructors
//    public LinkedList(){
//        head = null;
//        count = 0;
//    }
    
    public LinkedListS(Node<D> newHead){
        head = newHead;
        count = 1;
    }
    
    //Methods
   
    //add
    public void add(D newData){
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //get
    public D get(int index){
//        if(index <=0){
//            return -1;
//        }
        
        Node<D> current = head;
        for (int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }
    
    //size
    public int size(){
        return count;
    }
    
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    
    //remove
    public void remove(){
        //remove from back of the list
        Node<D> current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Daniyal");
        System.out.println(linkedlist);
        linkedlist.add("Shahmeer");
        System.out.println(linkedlist);
        linkedlist.remove();
        System.out.println(linkedlist);
        linkedlist.add("Omeer");
        linkedlist.add("Asif");
        linkedlist.add(0, "Sheheryar");
        System.out.println(linkedlist);
        linkedlist.add(2, "Shahmeer");
        System.out.println(linkedlist);
        linkedlist.size();
        System.out.println(linkedlist.size());
        linkedlist.remove(1);
        System.out.println(linkedlist);
        linkedlist.add(1, "Daniyal");
        System.out.println(linkedlist);
        linkedlist.get(4);
        System.out.println(linkedlist.get(4));
        linkedlist.isEmpty();
        System.out.println(linkedlist.isEmpty());
    }
    
}
