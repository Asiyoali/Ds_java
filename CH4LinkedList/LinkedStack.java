package CH4LinkedList;




import java.util.EmptyStackException;


public class LinkedStack<T> {
    public int count;
    public Node<T> top; // head

    // Constructors
    public LinkedStack() {

        count = 0;
        top = null;


    }

    public void push(T element) {
        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }


    public T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getElement();
    }
    public  void  display(){
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            Node<T> currentAddress = top;
            while (currentAddress != null){
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }
    }

    public int size() {
        return count;
    }

    public void printStack() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        Node<T> current = top;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();

        }
    }
    // method searchElements
    boolean searchElements(T searchdate) {
        Node<T> current = top;
        boolean found = false;
        while (current != null) {
            if(searchdate.equals(current.getElement()))
                found = true;
            current = current.getNext();
        }
        return found;

    }

    public int counter(T element) {
        Node<T> current = top;
        int number = 0;
        while (current != null) {
            if (element.equals(current.getElement()))
                number++;
        }
        return number;
    }

    // Method RemovedElement
    public void removeElement() {
        if (count <= 2){
            System.out.println("the Stack is lower than 2");
            return;
        }
        int middleElement = count / 2;
        Node <T> current = top;

        ////////////////////////////////
        while (current.next != null && current.next.next!= null){
            current.next = current.next.next;
            count --;

        }
    }
    // method displayRemovedElement
    public void displayRemovedElement(){
        Node<T> current = top;
        while (current != null){
            System.out.println(current.element);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("ruqiyo");
        stack.push("haawa");
        stack.push("Asiyo");
        stack.push("Wardo");
        stack.push("nuura");
        stack.push("qaalid");
        stack.push("Ruumaan");
        stack.push("nafiso");

        System.out.println("----------");
        stack.display();
        stack.displayRemovedElement();
        stack.removeElement();
        System.out.println("After Removed");
        stack.displayRemovedElement();




    }
}


