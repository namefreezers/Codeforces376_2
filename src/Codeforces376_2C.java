import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Codeforces376_2C {
	static class Graph {
		Map<Integer, Set<Integer>> g;
		int n;
		int k;
		boolean[] visited;

		Graph(int n, int k) {
			g = new HashMap<Integer, Set<Integer>>();
			this.n = n;
			this.k = k;
			visited = new boolean[n];
		}

		void addEdge(int i, int j) {
			Set<Integer> set = g.get(i);
			if (set == null) {
				set = new HashSet<Integer>();
				g.put(i, set);
			}
			set.add(j);

			set = g.get(j);
			if (set == null) {
				set = new HashSet<Integer>();
				g.put(j, set);
			}
			set.add(i);
		}

		List<Set<Integer>> getConnectedComponents() {
			List<Set<Integer>> resultSetList = new ArrayList<>();
			for (Integer i: g.keySet()) {
				LinkedList<Integer> list = new LinkedList<>();
				if (!visited[i]){
					Set<Integer> resultSet = new HashSet<>();
					list.addLast(i);
					resultSet.add(i);
					visited[i] = true;
					while(list.size()>0){
						int next = list.getFirst();		//BFS
						Set<Integer> nextSet = g.get(next);
						for(Integer j : nextSet){
							if(!visited[j]){
								list.addLast(j);
								resultSet.add(j);
								visited[j] = true;
							}
						}
					}
					resultSetList.add(resultSet);
				}
			}
			return resultSetList;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int k = Integer.parseInt(s[2]);
		s = in.nextLine().split(" ");
		int[] colors = new int[n];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Integer.parseInt(s[0]);
		}
		Graph graph = new Graph(n, k);
		for (int i = 0; i < m; i++) {
			s = in.nextLine().split(" ");
			graph.addEdge(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}
		in.close();
		List<Set<Integer>> connected = graph.getConnectedComponents();
		for (Set set : connected)
	}

}
