//  451. Sort Characters By Frequency

class SortCharactersByFrequency {
    public String frequencySort(String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> l : list) {
            for (int j = 0; j < l.getValue(); j++) {
                sb.append(l.getKey());
            }
        }
        return sb.toString();
    }
}