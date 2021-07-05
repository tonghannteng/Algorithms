//  648. Replace Words

class ReplaceWords {

    private TrieNode root;

    public Solution() {
        root = new TrieNode(); // root is Empty
    }

    private class TrieNode {
        private TrieNode[] children;
        private String isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }

    public void insert(String word) {
        if (word == null || word.isEmpty()) return;
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isWord = word;
    }

    public String search(String word) {
        if (word == null || word.isEmpty()) return null;
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            current = current.children[index];
            if (current == null) break;
            else if (current.isWord != null) {
                return current.isWord;
            }
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        for (String d : dictionary) {
            insert(d);
        }
        StringBuilder result = new StringBuilder();
        String [] arr = sentence.split(" ");
        for (String word: arr) {
            result.append(search(word)).append(" ");
        }
        return result.toString().trim();
    }
}