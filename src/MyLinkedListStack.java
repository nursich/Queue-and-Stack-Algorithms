import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyLinkedListStack<T> {
    private LinkedList<T> stack;

    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }
}