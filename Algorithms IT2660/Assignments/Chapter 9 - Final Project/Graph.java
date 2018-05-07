import java.util.*;
import java.lang.*;
import java.io.*;
 
class ShortestPath
{
    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    static int V=9;
    int minDistance(int dist[], Boolean spTreeSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (spTreeSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    //Print the constructed distance array
    void printDistance(int dist[], int n)
    {
        System.out.println("Vertex - Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " -------------> " + dist[i]);
    }
 
    //Dijkstra's algorithm to calculate the shortest path from a given source 
    void dijkstra(int graph[][], int source)
    {
        int dist[] = new int[V]; // The output array. dist[i] hold shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean spTreeSet[] = new Boolean[V];
 
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            spTreeSet[i] = false;
        }
 
        dist[source] = 0;
 
        // Find sp
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. 
            int u = minDistance(dist, spTreeSet);
 
            // Mark chosen vertex 
            spTreeSet[u] = true;
 
            // Update dist value of the chosen vertex of the adjacent verticex
            for (int v = 0; v < V; v++)
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!spTreeSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
         printDistance(dist, V); 
    }
 
    public static void main (String[] args)
    {
       int graph[][] = new int[][]{{0, 4, 14, 0, 0, 1, 5, 8, 0}, {4, 0, 8, 8, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2}, {0, 0, 7, 0, 9, 14, 16, 0, 0},
                                  {7, 5, 3, 9, 0, 10, 0, 4, 0}, {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {1, 0, 5, 0, 0, 2, 0, 1, 9}, {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 1, 0, 0, 9, 4, 7, 0}, {0, 0, 1, 0, 0, 9, 4, 7, 0} };
                                  
        ShortestPath sp = new ShortestPath();
        sp.dijkstra(graph, 4);
    }
}