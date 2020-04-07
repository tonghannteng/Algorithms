//  49. Group Anagrams

class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) return result;
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String word = new String(ch);
            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(s);
        }
        result.addAll(map.values());
        return result;
    }
}