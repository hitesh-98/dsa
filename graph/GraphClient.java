package graph;

import java.util.HashSet;

public class GraphClient {

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 4, 20);
		g.addEdge(2, 3, 30);
		g.addEdge(4, 3, 40);
		g.addEdge(3, 1, 50);
		
		g.display();
		System.out.println(g.noOfEdges());
		System.out.println(g.noOfEdges());
		
		System.out.println(g.hasPath(1, 4, new HashSet<Integer>()));
		g.printAllPath(1,4,new HashSet<Integer>() ,"1");

	}

}
