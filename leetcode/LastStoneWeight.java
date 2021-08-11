//  1046. Last Stone Weight

class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) return 0;
        if (stones.length == 1) return stones[0];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            queue.add(s);
        }
        while (queue.size() > 1) {
            int p1 = queue.remove();
            int p2 = queue.remove();
            if (p1 != p2) queue.add(Math.abs(p1 - p2));
        }
        return queue.isEmpty() ? 0 : queue.peek();
    }
}