package gurucoding.org.graph;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        System.out.println(graph.addVertex("A"));
        System.out.println(graph.addVertex("B"));
        System.out.println(graph.addVertex("C"));
        System.out.println(graph.addVertex("D"));

        System.out.println(graph.addEdge("A", "B"));
        System.out.println(graph.addEdge("A", "C"));
        System.out.println(graph.addEdge("B", "C"));
        System.out.println(graph.addEdge("B", "D"));
        System.out.println(graph.addEdge("D", "C"));
        graph.printGraph();

        System.out.println(graph.removeEdge("A", "C"));
        System.out.println(graph.removeEdge("B", "D"));
        graph.printGraph();

        System.out.println(graph.removeVertex("D"));
        graph.printGraph();
    }
}
