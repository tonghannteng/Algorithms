//  599. Minimum Index Sum of Two Lists

class MinimumIndexSumTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        int index = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if (map1.containsKey(list1[i]) && map2.containsKey(list1[i])) {
                int min = map1.get(list1[i]) + map2.get(list1[i]);
                if (min <= index) {
                    index = min;
                    result.add(list1[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}