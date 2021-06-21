//  1791. Find Center of Star Graph

class FindCenterStarGraph {

    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            map.put(u, map.getOrDefault(u, 0) + 1);
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (int m: map.keySet()) {
            if (map.get(m) == edges.length) return m;
        }
        return 0;
    }
}