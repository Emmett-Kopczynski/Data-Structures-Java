package structs.list;
//Java Library Imports


//Project Imports

/**
 * A Singly Linked List with a dummy head node and a tail pointer
 * @param <T> the generic representing the data held by the list
 * @author Emmett James Kopczynski (emmettkopo@gmai.com)
 */
public class LinkedList<T> implements List<T> {
    
    
    private class Node<T> {
        T data;
        Node next;
    
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

        public Node(T data){
            this(data, null);
        }

        public Node(){
            this(null, null);
        }
    }


    private Node<T> head = new Node<T>();
    private Node<T> tail = this.head;
    private int size = 0;

    /**
     * initializes the linked list with a dummy head node, a tail pointing to said head node, and a size of 0
     */
    public LinkedList(){
    }
    

    @Override
    public void add(T toAdd){
      
    } //TODO implement the add(T toAdd) function

    @Override
    public void add(T toAdd, int index){

    }//TODO implement the add(T toAdd, int index) function

    @Override
    public void addFirst(T toAdd){
        Node<T> newNode = new Node<T>(toAdd);
        newNode.next = this.head.next;
        this.head.next = newNode;

        if (this.size == 0){
            this.tail = newNode;
        }
        this.size = size + 1;
    }

    @Override
    public void clear(){

    }//TODO implement the clear() function
    
    @Override
    public boolean contains(T element){
        return false;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException{
        //input validation
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("get(int index) : index " + index + " out of bounds");
        }

        Node<T> cur = this.head.next;
        
        for(int i = 0; i<index; i++){
           cur = cur.next;
        }

        return cur.data;
    }

    /**
     * the getTail() method returnst the value of the last Node in the list
     * @return the last Node in the list
     */
    public T getTail(){
        return this.tail.data;
    }

    @Override
    public int indexOf(T element){
        return -1;
    }//TODO impllement the indexOf(T element) method

    @Override
    public boolean isEmpty(){
        return false;
    }//TODO implement the isEmpty() method

    @Override
    public int lastIndexOf(T element){
        return -1;
    }//TODO implement the lastIndexOf(T element) method

    @Override
    public T remove(int index){
        return null;
    }//TODO implement the remove(int index) method

    @Override
    public int remove(T element){
        return -1;
    }//TODO implement the remove(T element) method

    @Override
    public int size(){
        return -1;
    }//TODO implement the size() method

    @Override
    public LinkedList<T> subList(int fromIndex, int toIndex){
        return null;
    }//TODO implement the subList(int fromIndex, int toIndex) method

    @Override
    public String toString(){
        return null;
    }//TODO implement the toString() method

}

