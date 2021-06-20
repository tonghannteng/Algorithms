//  1876. Substrings of Size Three with Distinct Characters

class SubstringsSizeThreeDistinctCharacters {

    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (goodString(s.substring(i, i+3))) {
                count++;
            }
        }
        return count;
    }

    public boolean goodString(String s) {
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int j : c) {
            if (j > 1) return false;
        }
        return true;
    }
}