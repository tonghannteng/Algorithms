//  973. K Closest Points to Origin

import java.util.*;

class KClosestPointsOrigin {
    public int[][] kClosest(int[][] points, int K) {
        Map<int[], Integer> map = new HashMap<>();
        int[][] result = new int[K][points[0].length];
        for (int[] point : points) {
            int d = dist(point);
            map.put(point, d);
        }
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, (Comparator) (o1, o2) -> ((Comparable) ((Map.Entry) (o1)).getValue())
                .compareTo(((Map.Entry) (o2)).getValue()));
        int c = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            result[c] = (int[]) m.getKey();
            c++;
            if (c == K) break;
        }
        return result;
    }

    int dist(int arr[]) {
        return arr[0] * arr[0] + arr[1] * arr[1];
    }
}


