//  1408. String Matching in an Array

class StringMatchingArray {

    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        if (words.length == 0) return result;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (words[i].contains(words[j])) {
                        set.add(words[j]);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}