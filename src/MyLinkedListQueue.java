import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<T> {
    private LinkedList<T> queue;

    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }
}