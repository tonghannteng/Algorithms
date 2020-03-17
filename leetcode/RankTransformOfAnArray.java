//  1331. rank-transform-of-an-array

class RankTransformOfAnArray {

    public int[] arrayRankTransform(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        int[] result = new int[arr.length];
        Arrays.sort(a);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int index = 1;
        for (int num: a) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, index);
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            result[i] = hashMap.get(arr[i]);
        }
        return result;
    }
}