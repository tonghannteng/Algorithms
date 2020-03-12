//  824. Goat Latin

class GoatLatin {
    public String toGoatLatin(String S) {
        if (S.isEmpty()) return "";
        String vowel = "aeiouAEIOU";
        List<Character> vowelList = new ArrayList<>();
        for (int i = 0; i < vowel.length(); i++) {
            vowelList.add(vowel.charAt(i));
        }
        String[] words = S.trim().split(" ");
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (String word: words) {
            index++;
            if (vowelList.contains(word.charAt(0))) {
                result.append(word).append("ma");
            } else {
                result.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            for (int i = 0; i < index; i++) {
                result.append("a");
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}