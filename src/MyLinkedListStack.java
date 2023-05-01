import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyLinkedListStack<T> {
    private LinkedList<T> stack; // Instance variable

    public MyLinkedListStack() {    // Constructs a new MyLinkedListStack object with an empty linked list.
        stack = new LinkedList<>();
    }

    public void push(T data) {   // Pushes the specified element onto the top of this stack.
        stack.addFirst(data);    // @param element the element to push onto this stack
    }

    public boolean isEmpty() {    // Tests if this stack is empty.
        return stack.isEmpty();   // @return true if and only if this stack contains no items; false otherwise
    }

    public T pop() {     // Removes the element at the top of this stack and returns that element.
        if (isEmpty()) {
            throw new EmptyStackException();   // @throws EmptyStackException if this stack is empty
        }
        return stack.removeFirst();   // @return the element at the top of this stack
    }

    public T peek() {     // Looks at the element at the top of this stack without removing it from the stack.
        if (isEmpty()) {
            throw new EmptyStackException();    // @throws EmptyStackException if this stack is empty
        }
        return stack.peekFirst();    // @return the element at the top of this stack
    }

    public int size() {     // Returns the number of elements in this stack.
        return stack.size();
    }
}