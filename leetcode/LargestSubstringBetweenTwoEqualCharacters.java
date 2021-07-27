//  1624. Largest Substring Between Two Equal Characters

class LargestSubstringBetweenTwoEqualCharacters {
    
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s.length() == 0) return 0;
        int result = -1;
        int index;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, i);
            } else {
                index = i - map.get(current) - 1;
                result = Math.max(result, index);
            }
        }
        return result;
    }
}