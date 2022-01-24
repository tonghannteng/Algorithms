//  1971. Find if Path Exists in Graph

class FindPathExistsGraph {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge: edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        boolean[] visited = new boolean[n];

        while (!queue.isEmpty()) {
            int node = queue.remove();
            visited[source] = true;
            for (int c : adj.get(node)) {
                if (c == destination) return true;
                if (!visited[c]) {
                    queue.add(c);
                    visited[c] = true;
                }
            }
        }
        return false;
    }
}