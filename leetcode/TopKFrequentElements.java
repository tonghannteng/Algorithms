//  347. Top K Frequent Elements

class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }
        int[] r = new int[result.size()];
        for(int i = 0; i < r.length; i++) {
            r[i] = result.get(i);
        }
        return r;
    }
}