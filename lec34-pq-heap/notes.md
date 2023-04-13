# Lecture 34-36: Priority-queues; Heaps; Comparators

# Objectives

## KNOW:
- what a priority queue is
- what a heap is
- the difference between `Comparable` and `Comparator`
  
## BE ABLE TO:
- implement heap methods


---
# Reading

- https://algs4.cs.princeton.edu/24pq/
    - [Starter code](start/) (or [zip file](lec34.zip))


# Lecture Slides

- [Priority Queues](https://algs4.cs.princeton.edu/lectures/keynote/24PriorityQueues.pdf)


# Lab

- Go over `sink`
- [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) (Here's [some tests](./MedianFinderTest.java).)
  Use the Java library [PriorityQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/PriorityQueue.html).
- Talk about `Comparator`
- Huffman Encoding preview


# Assignment

- [Part 1](work/hw36a.md)
- [Part 2](work/hw36b.md)


# Links

- [Heap sort code](https://algs4.cs.princeton.edu/24pq/Heap.java.html) (Here's an [explanation](https://algs4.cs.princeton.edu/24pq/#:~:text=sorted%20output%20stream.-,Heapsort,-.%20We%20can))



# Quiz

Which one of these arrays does *not* represent an either min or max heap?

- `{ 100, 19, 36, 17, 3, 25, 1, 2, 7 }`
- `{ 1, 2, 3, 4, 5, 9}`
- `{ 1, 3, 2, 9, 5, 4}`
- `{ 6, 3, 5, 4, 2, 1}`
- `{ 6, 5, 3, 2, 4, 1}`

