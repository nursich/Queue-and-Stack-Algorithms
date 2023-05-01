import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<T> {
    private LinkedList<T> queue;

    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T data) {
        queue.addLast(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
}