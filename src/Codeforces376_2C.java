import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Codeforces376_2C {
	static class Graph {
		Map<Integer, List<Integer>> g;
		int n;
		int k;
		boolean[] visited;

		Graph(int n, int k) {
			g = new HashMap<Integer, List<Integer>>();
			this.n = n;
			this.k = k;
			visited = new boolean[n];
		}

		void addEdge(int i, int j) {
			List<Integer> list = g.get(i);
			if (list == null) {
				list = new LinkedList<Integer>();
				g.put(i, list);
			}
			list.add(j);

			list = g.get(j);
			if (list == null) {
				list = new LinkedList<Integer>();
				g.put(j, list);
			}
			list.add(i);
		}

		List<Set<Integer>> getConnectedComponents() {
			for (int i = 0; i< n; i++) {
				if (!visited[i]){
					
				}
			}
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int k = Integer.parseInt(s[2]);
		s = in.nextLine().split(" ");
		int[] socks = new int[n];
		for (int i = 0; i < socks.length; i++) {
			socks[i] = Integer.parseInt(s[0]);
		}
		Graph graph = new Graph(n, k);
		for (int i = 0; i < m; i++) {
			s = in.nextLine().split(" ");
			graph.addEdge(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}
		in.close();

	}

}
