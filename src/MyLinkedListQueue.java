import java.util.NoSuchElementException;
import java.util.LinkedList;

/**
 MyLinkedListQueue is a class that implements the Queue interface using a linked list.
 It has methods to enqueue, dequeue, peek, check if it is empty, and get the size of the queue.
 @param <T> the type of elements in the queue
 */

public class MyLinkedListQueue<T> {
    private LinkedList<T> queue;  // Instance variable

    public MyLinkedListQueue() {
        queue = new LinkedList<>();   // Constructor for MyLinkedListQueue that initializes an empty LinkedList
    }

    public void enqueue(T data) {    // Adds an element to the back of the queue
        queue.addLast(data);   // @param data the element to be added
    }

    public T dequeue() {      // Removes and returns the front element of the queue
        if (isEmpty()) {
            throw new NoSuchElementException();    // @throws NoSuchElementException if the queue is empty
        }
        return queue.removeFirst();   // @return the front element of the queue
    }

    public T peek() {     // Returns the front element of the queue without removing it
        if (isEmpty()) {
            throw new NoSuchElementException();     // @throws NoSuchElementException if the queue is empty
        }
        return queue.getFirst();    // @return the front element of the queue
    }

    public boolean isEmpty() {    // Checks if the queue is empty
        return size() == 0;       // @return true if the queue is empty, false otherwise
    }

    public int size() {      // Gets the number of elements in the queue
        return queue.size();     // @return the number of elements in the queue
    }
}