import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<E> {
    public ArrayList<E> stack;

    public MyArrayListStack() {
        stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
}