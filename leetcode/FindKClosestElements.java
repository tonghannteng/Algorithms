//  658. Find K Closest Elements

class FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        for (i = 0; i < k; i++) {
            queue.add(arr[i]);
        }

        while (i < arr.length) {
            if (Math.abs(arr[i] - x) < Math.abs(queue.peek() - x)) {
                queue.remove();
                queue.add(arr[i]);
            }
            i++;
        }
        return new LinkedList<>(queue);
    }
}