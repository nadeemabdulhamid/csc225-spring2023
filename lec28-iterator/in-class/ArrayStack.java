 

import java.util.NoSuchElementException;
import java.util.*;



public class ArrayStack<T> implements Iterable<T>, IStack<T> {
  private final static int CAPACITY = 40;
  
  private T[] array;
  private int size;

  
  public ArrayStack() {
    size = 0;
    array = (T[]) new Object[CAPACITY];
  }
  

  public T push(T item) {
    if (size == array.length) {
      throw new IllegalStateException("Stack full!");   
      // TODO:   fix this...
      // https://opendatastructures.org/ods-java/2_1_ArrayStack_Fast_Stack_O.html#SECTION00512000000000000000
    }
    array[size++] = item;
    return item;
  }

  
  public T pop() {
    if (size == 0) {
      throw new NoSuchElementException("Cannot pop from empty stack");
    }
    T result = array[size-1];
    array[--size] = null;  // being careful 
    return result;
  }

  
  public T peek() {
    if (size == 0) {
      throw new NoSuchElementException("Cannot peek into empty stack");
    }
    return array[size - 1];
  }
  

  public int size() {
    return size;
  }

  
  public boolean isEmpty() {
    return (size == 0);
  }

  public Iterator<T> iterator() {
      return new MyStackIterator();
  }
  
  
  private class MyStackIterator implements Iterator<T> {
      int curIndex; // always stores the index of the next thing to 
                      // return from the stack array
      
      public MyStackIterator() {
          curIndex = 0;
      }
      
      public T next() {
          if (!hasNext()) { throw new NoSuchElementException(); }
          int i = curIndex; // the index to return
          curIndex++;
          return array[i];
      }
      
      /*
       * there is more to return as long as curIndex
       * hasn't reached the size of the stack
       */
      public boolean hasNext() {
          return curIndex < size;
      }
      
  }
  
  
  
}
