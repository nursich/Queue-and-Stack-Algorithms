import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyLinkedListStack<T> {
    private LinkedList<T> stack;

    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(T data) {
        stack.addFirst(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}