#include <iostream>     // For input and output operations
#include <vector>       // For using vector container
#include <queue>        // For BFS queue
#include <omp.h>        // OpenMP library for parallel programming

using namespace std;

// Graph class definition
class Graph {

    int V;                          // Number of vertices in graph
    vector<vector<int>> adj;        // Adjacency list representation

public:

    // Constructor to initialize graph with V vertices
    Graph(int V) {
        this->V = V;                // Assign number of vertices
        adj.resize(V);              // Resize adjacency list
    }

    // Function to add edge between u and v
    void addEdge(int u, int v) {

        adj[u].push_back(v);        // Add v to u's adjacency list
        adj[v].push_back(u);        // Add u to v's adjacency list
                                     // Since graph is undirected
    }

    // 🔵 Parallel BFS Function
    void parallelBFS(int start) {

        vector<bool> visited(V, false);  // Track visited vertices
        queue<int> q;                    // Queue for BFS traversal

        visited[start] = true;           // Mark starting node visited
        q.push(start);                   // Push start node into queue

        cout << "\nParallel BFS Traversal: ";

        // Continue until queue becomes empty
        while (!q.empty()) {

            int size = q.size();         // Number of nodes at current level

            // Parallel loop using OpenMP
            #pragma omp parallel for
            for (int i = 0; i < size; i++) {

                int node = -1;           // Initialize node

                // Critical section to safely access shared queue
                #pragma omp critical
                {
                    if (!q.empty()) {

                        node = q.front(); // Get front node
                        q.pop();          // Remove node from queue

                        cout << node << " "; // Print node
                    }
                }

                // Process valid node
                if (node != -1) {

                    // Traverse all neighbors
                    for (int neighbor : adj[node]) {

                        // Check if neighbor not visited
                        if (!visited[neighbor]) {

                            // Critical section for shared visited array
                            #pragma omp critical
                            {
                                // Double check to avoid race condition
                                if (!visited[neighbor]) {

                                    visited[neighbor] = true; // Mark visited
                                    q.push(neighbor);         // Push to queue
                                }
                            }
                        }
                    }
                }
            }
        }

        cout << endl;
    }

    // 🔴 Parallel DFS Utility Function
    void parallelDFSUtil(int node, vector<bool> &visited) {

        bool alreadyVisited;   // Store visit status

        // Critical section for shared visited array
        #pragma omp critical
        {
            alreadyVisited = visited[node];

            // If node not visited
            if (!visited[node]) {

                visited[node] = true; // Mark visited
                cout << node << " ";  // Print node
            }
        }

        // Return if already visited
        if (alreadyVisited)
            return;

        // Parallel loop through adjacency list
        #pragma omp parallel for
        for (int i = 0; i < adj[node].size(); i++) {

            int neighbor = adj[node][i];

            // Check if neighbor not visited
            if (!visited[neighbor]) {

                // Create parallel task
                #pragma omp task
                parallelDFSUtil(neighbor, visited);
            }
        }
    }

    // 🔴 Parallel DFS Function
    void parallelDFS(int start) {

        vector<bool> visited(V, false); // Track visited nodes

        cout << "\nParallel DFS Traversal: ";

        // Start parallel region
        #pragma omp parallel
        {

            // Only one thread executes this block
            #pragma omp single
            {
                parallelDFSUtil(start, visited);
            }
        }

        cout << endl;
    }
};

// Main function
int main() {

    int V, E;

    // Input number of vertices
    cout << "Enter number of vertices: ";
    cin >> V;

    // Create graph object , zero base indexing
    Graph g(V);

    // Input number of edges
    cout << "Enter number of edges: ";
    cin >> E;

    // Input graph edges
    cout << "Enter edges (u v):\n";

    for (int i = 0; i < E; i++) {

        int u, v;

        cin >> u >> v;

        g.addEdge(u, v); // Add edge to graph
    }

    int start;

    // Input starting vertex
    cout << "Enter starting vertex: ";
    cin >> start;

    // Perform Parallel BFS
    g.parallelBFS(start);

    // Perform Parallel DFS
    g.parallelDFS(start);

    return 0;
}

/*

GRAPH STRUCTURE:

       0
      / \
     1   2
    / \   \
   3   4   5


INPUT:
Enter number of vertices: 6
Enter number of edges: 5

Edges:
0 1
0 2
1 3
1 4
2 5

Starting vertex: 0


EXPECTED OUTPUT:

Parallel BFS Traversal: 0 1 2 3 4 5
Parallel DFS Traversal: 0 1 3 4 2 5

(Note:
DFS order may vary because execution is parallel)

*/


/*


======================== THEORY ========================

1) GRAPH
--------------------------------------------------------
A graph is a non-linear data structure consisting of:
- Vertices (Nodes)
- Edges (Connections)
Example:

       0
      / \
     1   2
    / \   \
   3   4   5


2) GRAPH REPRESENTATION
--------------------------------------------------------
This program uses Adjacency List representation.
vector<vector<int>> adj;
Advantages:
- Memory efficient
- Faster traversal
- Best for sparse graphs


3) BFS (Breadth First Search)
--------------------------------------------------------
BFS traverses graph level-by-level.
Uses:
- Queue (FIFO)
Traversal Example:
0 → 1 → 2 → 3 → 4 → 5
Time Complexity:
O(V + E)


4) DFS (Depth First Search)
--------------------------------------------------------
DFS explores deeply before backtracking.
Uses:
- Recursion
- Stack concept
Traversal Example:
0 → 1 → 3 → 4 → 2 → 5
Time Complexity:
O(V + E)


5) PARALLEL PROGRAMMING
--------------------------------------------------------
Parallel programming means multiple tasks execute
simultaneously using multiple CPU cores.
Advantages:
- Faster execution
- Better CPU utilization
- Efficient for large datasets


6) OPENMP
--------------------------------------------------------
OpenMP (Open Multi-Processing) is an API used for
parallel programming in C/C++.
Header File:
#include <omp.h>

Compilation Command:
g++ file.cpp -fopenmp


7) IMPORTANT OPENMP DIRECTIVES
--------------------------------------------------------

a) #pragma omp parallel for
Executes loop iterations in parallel.

b) #pragma omp critical
Allows only one thread at a time.
Used to avoid race conditions.

c) #pragma omp task
Creates independent parallel tasks.

d) #pragma omp single
Only one thread executes the block.

8) RACE CONDITION
--------------------------------------------------------
Occurs when multiple threads access or modify shared
data simultaneously causing incorrect results.

Solution:
#pragma omp critical

9) APPLICATIONS
--------------------------------------------------------
BFS Applications:
- Shortest path
- Social network analysis
- Web crawling

DFS Applications:
- Cycle detection
- Maze solving
- Topological sorting

========================================================

*/
