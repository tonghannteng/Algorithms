//  1200. Minimum Absolute Difference

class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr.length == 0) return result;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < min) {
                min = arr[i + 1] - arr[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> list = new ArrayList<>();
            if (arr[i + 1] - arr[i] == min) {
                list.add(arr[i]);
                list.add(arr[i + 1]);
            }
            if (list.size() == 2) {
                result.add(list);
            }
        }
        return result;
    }
}