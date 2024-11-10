package CH4LinkedList;

public class Node <T>{
    // fields or variables
    public T element; // have Value
    public Node<T> next; // have Address
    // Construct
    public Node(){
        element =null;
        next =null;
    }
    public Node(T element){
        this.element = element;
        next = null;

    }
    // Methods / property
    // get / set
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public T getElement() {
        return element;

    }
    public void setElement(T element)
    {
        this.element = element;
    }






}
