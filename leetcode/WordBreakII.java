//  140. Word Break II

class WordBreakII {
    Map<String, List<String>> map1 = new HashMap();

    public List<String> wordBreak(String s, List<String> wordDict) {
        if (map1.containsKey(s))
            return map1.get(s);
        List<String> result = new LinkedList<>();
        if (wordDict.contains(s))
            result.add(s);
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            if (wordDict.contains(left)) {
                for (String ss : wordBreak(s.substring(i), wordDict)) {
                    result.add(left + " " + ss);
                }
            }
        }

        map1.put(s, result);
        return result;
    }
}