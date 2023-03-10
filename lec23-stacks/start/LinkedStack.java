 

import java.util.NoSuchElementException;

public class LinkedStack<T> implements IStack<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  private Node top;

  
  public LinkedStack() {
    top = null;
  }
  

  public T push(T item) {
    // TODO: fill this in
    return null;
  }


  public T pop() {
    // TODO: fill this in
    return null;
  }


  public T peek() {
    if (top == null) {
      throw new NoSuchElementException("Stack is empty");
    }
    
    // TODO: fill this in
    return null;
  }


  // TODO:  make this more efficient...
  public int size() {
    int count = 0;
    for (Node node = top; node != null; node = node.next) {
        count++;
    }
    return count;
  }


  public boolean isEmpty() {
    return (top == null);
  }

}
