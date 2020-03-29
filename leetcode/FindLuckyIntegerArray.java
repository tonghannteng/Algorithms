//  1394. Find Lucky Integer in an Array

class FindLuckyIntegerArray {

    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int max = -1;

        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (me.getKey().equals(me.getValue())) {
                if (me.getValue() > max) {
                    max = me.getValue();
                }
            }
        }
        return max;
    }
}