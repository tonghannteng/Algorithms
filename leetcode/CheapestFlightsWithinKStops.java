//  787. Cheapest Flights Within K Stops

class CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, Map<Integer, Integer>> prices = new HashMap<>();
        for (int[] flight : flights) {
            if (!prices.containsKey(flight[0])) {
                prices.put(flight[0], new HashMap<>());
            }
            prices.get(flight[0]).put(flight[1], flight[2]);
        }

        Queue<int[]> queue = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
        queue.add(new int[]{0, src, K + 1});
        while (!queue.isEmpty()) {
            int[] top = queue.remove();
            int price = top[0];
            int city = top[1];
            int stop = top[2];
            if (city == dst) {
                return price;
            }
            if (stop > 0) {
                Map<Integer, Integer> adj = prices.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) {
                    queue.add(new int[]{price + adj.get(a), a, stop - 1});
                }
            }
        }
        return -1;
    }
}