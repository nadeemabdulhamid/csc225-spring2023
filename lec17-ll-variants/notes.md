# Lecture 17: Linked list variants; Object equality

# Objectives

## KNOW:
- what doubly-linked and circularly-linked lists are
- that the superclass of all classes in Java is `Object`
  
## BE ABLE TO:
- write methods to perform operations on doubly-linked circular lists
- define equals() methods for Java classes


---
# Watch (before class)

- tba


---
# Classwork

- Starting with [the code here](start/), implement the following methods in `DLList.java`:

```
/** Add newValue to the end of this list. */
public void addLast(int newValue)

/**
 * Add newValue right after the targetValue in the list, if it is present. If
 * targetValue is not in the list, has no effect.
 */
public void addAfter(int targetValue, int newValue)

/**
 * Removes targetValue from this list, if it is present.
 */
public void remove(int targetValue)

/**
 * Produces true if targetValue is in the list.
 */
public boolean contains(int targetValue)

/**
 * Produces a text rendering of the contents of this list, separated by commas.
 */
public String toString()
```

---
# Assignment

- [Here](work/hw17.md)


---
# Notes/Links

- https://en.wikipedia.org/wiki/Doubly_linked_list
- [Lecture source code](final/)
- [`equals()` method code examples](../lec17a-equality/final/)


