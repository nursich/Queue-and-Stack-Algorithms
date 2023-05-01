import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> queue;

    public MyArrayListQueue() {
        queue = new ArrayList<E>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(E element) {
        queue.add(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }
}