import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 MyArrayListQueue is a class that implements a queue using an ArrayList data structure.
 It contains methods for enqueueing, dequeue, peeking, checking if the queue is empty, and getting the size.
 */

public class MyArrayListQueue<E> {
    private ArrayList<E> queue;  // Instance variable

    public MyArrayListQueue() {     // Constructor for MyArrayListQueue that initializes an empty ArrayList
        queue = new ArrayList<E>();
    }

    public boolean isEmpty() {   // Method for checking if the queue is empty using the isEmpty method of MyArrayList
        return queue.isEmpty();   //  @return true if the queue is empty, false otherwise
    }

    public void enqueue(E element) {    // Method for adding an element to the back of the queue using the add method of MyArrayList
        queue.add(element);    // @param element the element to be added to the back of the queue
    }

    public E dequeue() {    // Method for removing and returning the front element of the queue using the removeFirst method of MyArrayList
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");    //  @throws NoSuchElementException if the queue is empty
        }
        return queue.remove(0);     // @return the front element of the queue that was removed
    }

    public E peek() {      // Method for returning the front element of the queue without removing it using the get method of MyArrayList
        if (isEmpty()) {    // @return the front element of the queue
            throw new NoSuchElementException("Queue is empty");  // @throws NoSuchElementException if the queue is empty
        }
        return queue.get(0);
    }

    public int size() {     // Method for getting the number of elements in the queue using the size method of MyArrayList
        return queue.size();  // @return the number of elements in the queue
    }
}