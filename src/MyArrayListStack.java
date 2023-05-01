import java.util.EmptyStackException;
import java.util.ArrayList;

/**
 A stack implementation using MyArrayList as the underlying data structure.
 This implementation follows the LIFO (Last-In-First-Out) principle.
 @param <E> The type of elements stored in the stack.
 */

public class MyArrayListStack<E> {
    public ArrayList<E> stack;   // instance variable

    public MyArrayListStack() {
        stack = new ArrayList<>();  // Constructor for MyArrayListStack that initializes an empty ArrayList
    }

    public void push(E element) {    //  Pushes an element onto the top of the stack.
        stack.add(element);     //  @param element The element to be pushed onto the stack.
    }

    public E pop() {          // Removes and returns the element at the top of the stack.
        if (isEmpty()) {
            throw new EmptyStackException();     // @throws EmptyStackException if the stack is empty.
        }
        return stack.remove(stack.size() - 1);     // @return The element at the top of the stack.
    }

    public E peek() {    // Returns the element at the top of the stack without removing it.
        if (isEmpty()) {
            throw new EmptyStackException();   // @throws EmptyStackException if the stack is empty.
        }
        return stack.get(stack.size() - 1);    // @return The element at the top of the stack.
    }

    public boolean isEmpty() {   // @return true if the stack is empty, false otherwise.
        return stack.isEmpty();
    }

    public int size() {      // Returns the number of elements in the stack.
        return stack.size();
    }
}