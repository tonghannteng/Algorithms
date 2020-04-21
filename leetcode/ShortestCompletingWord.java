//  748. Shortest Completing Word

class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int minLength = 1001;
        String result = "";
        for (String w : words) {
            if (completingWord(licensePlate, w) && w.length() < minLength) {
                minLength = w.length();
                result = w;
            }
        }
        return result;
    }

    private boolean completingWord(String licensePlate, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = Character.toLowerCase(licensePlate.charAt(i));
            if (Character.isAlphabetic(licensePlate.charAt(i))) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > 0) {
                return false;
            }
        }
        return true;
    }
}