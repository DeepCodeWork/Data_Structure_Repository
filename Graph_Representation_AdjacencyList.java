import java.util.LinkedList;

public class Graph_Representation_AdjacencyList{

    // Initiating graph constructor
    static class Graph{
        int V;
        LinkedList<Integer> adjArrayList[];

        Graph(int V){
            this.V = V;
            
            adjArrayList = new LinkedList[V];

            for(int i =0;i<V;i++){
                adjArrayList[i] = new LinkedList<>();
            }
        }
    }

     static void addEdge(Graph graph, int source,int destination){
        // Undirected Graph
        
        //Adding source to destination 2->1
        graph.adjArrayList[source].add(destination);
   
        //Adding destination to source 1->2
        graph.adjArrayList[destination].add(source);
    }


    //Travesing the graph
    static void traverseGraph(Graph graph){
        for(int i=0;i<graph.V;i++){
            System.out.println("AdjacencyList for vertx v "+i);
            System.out.print("Head");
            for(Integer p:graph.adjArrayList[i]){
                System.out.print("-->"+p);
            }
            System.out.println("\n");
        }
    }

    // Main function
    public static void main(String args[]){
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 4, 1);
        traverseGraph(graph);   
    }
}