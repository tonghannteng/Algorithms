//  1763. Longest Nice Substring

class LongestNiceSubstring {

    public String longestNiceSubstring(String s) {
        if (s.length() <= 1) {
            return "";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (goodString(sub)) {
                    int l = result.length();
                    if (sub.length() > l) {
                        result = sub;
                    }
                }
            }
        }
        return result;
    }

    public boolean goodString(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(Character.toUpperCase(s.charAt(i)))
                    || !set.contains(Character.toLowerCase(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}