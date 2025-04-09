# Stack and Queue Algorithms - Documentation

# @MyArrayListStack

### push
**Description**: Pushes an element onto the top of the stack.
```java
public void push(E element) {
        stack.add(element);
    }
```

### pop
**Description**: Removes and returns the element at the top of the stack.
```java
public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
```

### peek
**Description**: Returns the element at the top of the stack without removing it.
```java
public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
```

### isEmpty
**Description**: Returns true if the stack is empty, false otherwise.
```java
public boolean isEmpty() {
        return stack.isEmpty();
    }
```

### size
**Description**: Returns the number of elements in the stack.
```java
public int size() {
        return stack.size();
    }
```

# @MyArrayListQueue

### enqueue
**Description**: Method for adding an element to the back of the queue using the add method of MyArrayList.
```java
public void enqueue(E element) {
        queue.add(element);
    }
```

### dequeue
**Description**: Method for removing and returning the front element of the queue using the removeFirst method of MyArrayList.
```java
public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }
```

### peek
**Description**: Method for returning the front element of the queue without removing it using the get method of MyArrayList.
```java
public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.get(0);
    }
```

### isEmpty
**Description**: Method for checking if the queue is empty using the isEmpty method of MyArrayList.
```java
public boolean isEmpty() {
        return queue.isEmpty();
    }
```

### size
**Description**: Method for getting the number of elements in the queue using the size method of MyArrayList.
```java
public int size() {
        return queue.size();
    }
```

# @MyLinkedListStack

### push
**Description**: Pushes the specified element onto the top of this stack.
```java
public void push(T data) {
        stack.addFirst(data);
    }
```

### pop
**Description**: Removes the element at the top of this stack and returns that element.
```java
public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
```

### peek
**Description**: Returns the element at the top of the stack without removing it.
```java
public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peekFirst();
    }
```

### isEmpty
**Description**: Checks if this stack is empty.
```java
public boolean isEmpty() {
        return stack.isEmpty();
    }
```

### size
**Description**: Returns the number of elements in this stack.
```java
public int size() {
        return stack.size();
    }
```

# @MyLinkedListQueue

### enqueue
**Description**: Adds an element to the back of the queue
```java
public void enqueue(T data) {
        queue.addLast(data);
    }
```

### dequeue
**Description**: Removes and returns the front element of the queue
```java
public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }
```

### peek
**Description**: Returns the front element of the queue without removing it
```java
public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
```

### isEmpty
**Description**: Checks if the queue is empty
```java
public boolean isEmpty() {
        return size() == 0;
    }
```

### size
**Description**: Gets the number of elements in the queue
```java
public int size() {      // Gets the number of elements in the queue
        return queue.size();
    }
```
