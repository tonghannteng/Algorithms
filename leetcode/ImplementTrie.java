//  208. Implement Trie (Prefix Tree)

class Node {
    char val;
    boolean isWord;
    Node[] children = new Node[26];
    Node(char c) {
        this.val = c;
    }
}

class ImplementTrie {

    private final Node root;

    /** Initialize your data structure here. */
    public ImplementTrie() {
        root = new Node(' ');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new Node(c);
            }
            temp = temp.children[index];
        }
        temp.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return temp.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */