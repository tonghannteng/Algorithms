//  1768. Merge Strings Alternately

class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        // int l = Math.max(word1.length(), word2.length());
        while(true) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j));
                j++;
            }
            if (sb.length() >= word1.length() + word2.length()) {
                break;
            }
        }
        return sb.toString();
    }
}