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

Helper code:
```
static class Edge implements Comparable<Edge> {
		int i, j, wgt;

		public Edge(int i, int j, int wgt) {
			super();
			this.i = i;
			this.j = j;
			this.wgt = wgt;
		}

		public int compareTo(Edge other) {
			return other.wgt - this.wgt;
		}

		public String toString() {
			return "Edge [i=" + i + ", j=" + j + ", wgt=" + wgt + "]";
		}
	}
	
	public int dist(int[] ptA, int[] ptB) {
		return Math.abs(ptA[0] - ptB[0]) + Math.abs(ptA[1] - ptB[1]);
	}
```


# Friday Activity

- Fill in course evaluations
- https://leetcode.com/problems/number-of-provinces/

```
Sketch of an algorithm:

 Create an array of booleans, `visited`, where `visited[i]` means that 
 city `i` has been taken into account and counted as part of a province.
 
 Go through cities 0 through N:
 	if any one is not visited:
 		increment the number of provinces
 		perform a DFS from that city
 		
 Return the number of provinces
 

DFS(i): depth-first search from city #i
	set `visited[i]` to true
	for all cities, j, 0 through N:
		if j is not i AND j is not visited already AND i is connected to j:
			recursively DFS from j
```

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


