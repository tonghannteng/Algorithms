//  3. Longest Substring Without Repeating Characters

class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int a = 0;
        int b = 0;
        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        while (a < s.length()) {
            if (!set.contains(s.charAt(a))) {
                set.add(s.charAt(a));
                a++;
                if (set.size() > max) {
                    max = set.size();
                }
            } else {
                set.remove(s.charAt(b));
                b++;
            }
        }
        return max;
    }
}