package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int V) {
		for (int i = 1; i <= V; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean containsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public int noOfEdges() {
		int ans = 0;
		for (int key : map.keySet()) {
			ans += map.get(key).size();
		}

		return ans / 2; // every edge is present in two nodes
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void display() {
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(i + " -> " + map.get(i));
		}
	}

	public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
		// add node to visited set
		visited.add(src);

		// check if reached to destination
		if (src == dest) {
			return true;
		}

		// check for neighbor
		for (int neighbor : map.get(src).keySet()) {

			// check only for unvisited node
			if (!visited.contains(neighbor)) {
				boolean res = hasPath(neighbor, dest, visited);

				if (res) {
					return true;
				}
			}
		}
		// if no path exists even via neighbor
		return false;
	}

	public void printAllPath(int src, int dest, HashSet<Integer> visited, String ans) {

		// add node to visited set
		visited.add(src);

		// check if reached to destination
		if (src == dest) {
			System.out.println(ans);
			visited.remove(src);
			return;
		}

		// check for neighbor
		for (int neighbor : map.get(src).keySet()) {

			// check only for unvisited node
			if (!visited.contains(neighbor)) {
				printAllPath(neighbor, dest, visited, ans + neighbor);
			}
		}

		visited.remove(src);

	}

	public boolean bfs(int src, int dst) {

		HashSet<Integer> visited = new HashSet<>();

		Queue<Integer> q = new LinkedList<>();
		q.add(src);

		// work till q is not empty
		while (!q.isEmpty()) {

			// q remove
			int rn = q.remove();

			// ignore if the node is already visited
			if (visited.contains(rn))
				continue;

			// visited
			visited.add(rn);

			// work
			if (rn == dst)
				return true;

			// nbrs
			for (int nbr : map.get(rn).keySet()) {

				if (!visited.contains(nbr))
					q.add(nbr);
			}

		}

		return false;

	}
	
	
	public boolean DFS(int src, int dst) {

		HashSet<Integer> visited = new HashSet<>();

		// initial setup
		Stack<Integer> s = new Stack<>();
		s.push(src);

		// work till q is not empty
		while (!s.isEmpty()) {

			// s remove
			int rn = s.pop();

			// ignore if the node is already visited
			if (visited.contains(rn))
				continue;

			// visited
			visited.add(rn);

			// work
			if (rn == dst)
				return true;

			// nbrs
			for (int nbr : map.get(rn).keySet()) {

				if (!visited.contains(nbr))
					s.push(nbr);
			}

		}

		return false;

	}
	
	
	public void BFT() {

		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		// for every src do the work
		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			// initial setup
			q.add(src);

			// work till q is not empty
			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				// ignore if the node is already visited
				if (visited.contains(rn))
					continue;

				// visited
				visited.add(rn);

				// work
				System.out.print(rn);

				// nbrs
				for (int nbr : map.get(rn).keySet()) {

					if (!visited.contains(nbr))
						q.add(nbr);
				}

			}

		}

		System.out.println();

	}
	
	
	public void DFT() {

		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> s = new Stack<>();

		// for every src do the work
		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			// initial setup
			s.push(src);

			// work till q is not empty
			while (!s.isEmpty()) {

				// q remove
				int rn = s.pop();

				// ignore if the node is already visited
				if (visited.contains(rn))
					continue;

				// visited
				visited.add(rn);

				// work
				System.out.print(rn);

				// nbrs
				for (int nbr : map.get(rn).keySet()) {

					if (!visited.contains(nbr))
						s.push(nbr);
				}

			}

		}

		System.out.println();

	}
	
	
	public boolean isCyclic() {

		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		// for every src do the work
		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			// initial setup
			q.add(src);

			// work till q is not empty
			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				// ignore if the node is already visited
				if (visited.contains(rn))
					return true;

				// visited
				visited.add(rn);

				// nbrs
				for (int nbr : map.get(rn).keySet()) {

					if (!visited.contains(nbr))
						q.add(nbr);
				}

			}

		}

		return false;

	}

	public boolean isConnected() {

		int comp = 0;

		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		// for every src do the work
		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			comp++;

			// initial setup
			q.add(src);

			// work till q is not empty
			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				// ignore if the node is already visited
				if (visited.contains(rn))
					continue;

				// visited
				visited.add(rn);

				// nbrs
				for (int nbr : map.get(rn).keySet()) {

					if (!visited.contains(nbr))
						q.add(nbr);
				}

			}

		}

		return comp == 1;

	}

	public boolean isTree() {
		return !isCyclic() && isConnected();
	}

	
	public ArrayList<ArrayList<Integer>> getCC() {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		// for every src do the work
		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			// new component area
			ArrayList<Integer> comp = new ArrayList<>();

			// initial setup
			q.add(src);

			// work till q is not empty
			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				// ignore if the node is already visited
				if (visited.contains(rn))
					continue;

				// visited
				visited.add(rn);

				// work
				comp.add(rn);

				// nbrs
				for (int nbr : map.get(rn).keySet()) {

					if (!visited.contains(nbr))
						q.add(nbr);
				}

			}

			ans.add(comp);

		}

		return ans;

	}
	
	

}
