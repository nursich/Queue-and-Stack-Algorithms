import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<E> {
    private ArrayList<E> stack;

    public MyArrayListStack() {
        stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }
}