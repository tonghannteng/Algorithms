//  720. Longest Word in Dictionary

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LongestWordDictionary {

    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String w = "";
        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                if (w.length() < word.length()) {
                    w = word;
                }
            }
        }
        return w;
    }
}