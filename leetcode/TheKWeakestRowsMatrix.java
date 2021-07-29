//  1337. The K Weakest Rows in a Matrix

class TheKWeakestRowsMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        PriorityQueue<Soldier> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            priorityQueue.add(new Soldier(count, i));
        }
        for (int j = 0; j < k; j++) {
            if (!priorityQueue.isEmpty()) {
                result[j] = priorityQueue.poll().index;
            }
        }
        return result;
    }
}

class Soldier implements Comparable<Soldier> {
    int soldiers, index;
    Soldier(int soldiers, int index) {
        this.soldiers = soldiers;
        this.index = index;
    }

    @Override
    public int compareTo(Soldier soldier) {
        if (this.soldiers == soldier.soldiers) {
            if (this.index > soldier.index) {
                return 1;
            }
        } else if (this.soldiers > soldier.soldiers) {
            return 1;
        }
        return -1;
    }
}


