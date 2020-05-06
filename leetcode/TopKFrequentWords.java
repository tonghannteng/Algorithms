//  692. Top K Frequent Words

class MapNode {
    String key;
    int value;

    MapNode(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new LinkedList<>();
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        List<MapNode> mapNodeList = new ArrayList<>();
        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            mapNodeList.add(new MapNode(e.getKey(), e.getValue()));
        }
        mapNodeList.sort((o1, o2) -> o2.value == o1.value ? o1.key.compareTo(o2.key) : o2.value - o1.value);
        int count = 0;
        for (MapNode r : mapNodeList) {
            result.add(r.key);
            count++;
            if (count == k) break;
        }
        return result;
    }
}