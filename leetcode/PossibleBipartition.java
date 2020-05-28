//  886. Possible Bipartition

class PossibleBipartition {

    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[][] graph = new int[N][N];
        for (int d[] : dislikes) {
            graph[d[0] - 1][d[1] - 1] = 1;
            graph[d[1] - 1][d[0] - 1] = 1;
        }
        int color[] = new int[N];
        for (int j = 0; j < N; j++) {
            if (color[j] != 0)
                continue;
            Deque<Integer> queue = new ArrayDeque<>();
            queue.offer(j);
            color[j] = 1;
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                for (int i = 0; i < graph[curr].length; i++) {
                    if (graph[curr][i] == 1) { // if curr & i dislike each other
                        if (color[i] == color[curr]) // if curr & i have the same color return false
                            return false;
                        if (color[i] == 0) { // check if i is not visited
                            color[i] = -color[curr]; // assign opposite color to i
                            queue.offer(i);
                        }
                    }
                }
            }
        }
        return true;
    }
}