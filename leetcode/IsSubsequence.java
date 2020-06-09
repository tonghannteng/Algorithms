//  392. Is Subsequence

class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int c = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(c) == t.charAt(i)) {
                c++;
            }
            if (c == s.length()) {
                return true;
            }
        }
        return c == s.length();
    }
}