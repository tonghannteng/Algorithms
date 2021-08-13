//  703. Kth Largest Element in a Stream

class KthLargest {

    private PriorityQueue<Integer> priorityQueue;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.priorityQueue = new PriorityQueue<>(k);
        for (int num: nums) {
            this.add(num);
        }
    }

    public int add(int val) {
        if (priorityQueue.size() == this.k) {
            if (priorityQueue.peek() < val) {
                priorityQueue.poll();
                priorityQueue.add(val);
            }
        } else {
            priorityQueue.add(val);
        }

        return priorityQueue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */