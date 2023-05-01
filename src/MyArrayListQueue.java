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
}
