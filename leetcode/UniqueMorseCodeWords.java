//  804. Unique Morse Code Words

class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        Set<String>  s = new HashSet<>();
        for (String word : words) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                str.append(morse[word.charAt(j) - 97]);
            }
            s.add(str.toString());
        }
        return s.size();
    }
}