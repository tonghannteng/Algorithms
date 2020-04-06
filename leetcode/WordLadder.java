//  127. Word Ladder

class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        int count = 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.remove();
                if (word.equals(endWord)) {
                    return count + 1;
                }
                for (int j = 0; j < word.length(); j++) {
                    char[] wordChar = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        wordChar[j] = c;
                        String s = new String(wordChar);
                        if (set.contains(s) && !s.equals(word)) {
                            queue.add(s);
                            set.remove(s);
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }
}