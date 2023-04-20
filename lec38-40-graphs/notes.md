# Lecture 38-40: Graphs

# Objectives

## KNOW:
- ways to represent a graph data structure
  
## BE ABLE TO:
- solve problems using fundamental graph algorithms, including depth-first and breadth-first search, and minimum spanning trees


---
# Reading

- https://algs4.cs.princeton.edu/40graphs/


# Lecture Slides

- [Undirected Graphs](https://algs4.cs.princeton.edu/lectures/keynote/41UndirectedGraphs.pdf)


# Lab

- https://leetcode.com/problems/min-cost-to-connect-all-points/


# Friday Activity

- https://leetcode.com/problems/number-of-provinces/


---

# Notes

## Graph API

![graph api](https://algs4.cs.princeton.edu/41graph/images/graph-api.png)

## Implementations

- What are two/three ways to implement the `Graph` API?
    - [A](https://algs4.cs.princeton.edu/41graph/Graph.java.html)
    - [B](https://algs4.cs.princeton.edu/41graph/AdjMatrixGraph.java.html)
    - [Summary](https://algs4.cs.princeton.edu/lectures/keynote/41UndirectedGraphs.pdf#page=24)

## Typical graph-processing code

- What does this compute?

```
    //
    public static int d(Graph G, int v) {
    int d = 0;
    for (int w : G.adj(v))
        d++;
    return d;
    }
```

```
    // 
    public static int md(Graph G) {
        int m = 0;
        for (int v = 0; v < G.V(); v++)
            if (G.degree(v) > m)
                m = G.degree(v);
        return m;
    }
```

```
    // 
    public static int n(Graph G) {
        int c = 0;
        for (int v = 0; v < G.V(); v++)
            for (int w : G.adj(v))
                if (v == w) c++;
        return c/2;   // why?
    }
```


