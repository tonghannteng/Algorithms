//  243. Shortest Word Distance

class ShortestWordDistance {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int first = -1;
        int second = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                first = i;
            }
            if (wordsDict[i].equals(word2)) {
                second = i;
            }
            if (first != -1 && second != -1) {
                result = Math.min(result, Math.abs(second - first));
            }
        }
        return result;
    }
}