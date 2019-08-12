import java.util.Iterator;
import java.util.LinkedList;

public class Breadth_First_Search{
    
    static class Graph{
        int V;
        LinkedList<Integer> adjLinkedList[];
    
        Graph(int V){
            this.V=V;

            adjLinkedList = new LinkedList[V];

            for(int i=0;i<V;i++){
                adjLinkedList[i] = new LinkedList<Integer>();
            }


        }
    }

    static void addEdge(Graph graph,int source,int destination){
       graph.adjLinkedList[source].add(destination);
       graph.adjLinkedList[destination].add(source);
    }

    static void printGraph(Graph graph){
        for(int i=0;i<graph.V;i++){
            System.out.println("For vertex "+i);
            for(Integer p:graph.adjLinkedList[i]){
                System.out.print("-->"+p);
            }
            System.out.println();
        }
    }

    static void BFS(Graph graph, int start){
        boolean visited[] = new boolean[graph.V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[start]=true;
        queue.add(start);
        while(queue.size()!=0){
            int s = queue.poll();
            System.out.println(s+" ");
            Iterator<Integer> i = graph.adjLinkedList[s].iterator();
            while(i.hasNext()){
                int j = i.next();
               // System.out.println(j+"xxx");
                if(!visited[j]){
                    visited[j]=true;
                    queue.add(j);
                }
            }
        }

    }

    public static void main(String args[]) {
        Graph graph = new Graph(4); 
  
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 2); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 2, 0); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 3); 
        printGraph(graph);

        System.out.println("\n\n");
        BFS(graph, 2);
    
    }

    
}