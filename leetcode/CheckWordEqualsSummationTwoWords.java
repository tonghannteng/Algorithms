//  1880. Check if Word Equals Summation of Two Words

class CheckWordEqualsSummationTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder f = new StringBuilder();
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            f.append((firstWord.charAt(i) - 'a'));
        }
        for (int i = 0; i < secondWord.length(); i++) {
            s.append(secondWord.charAt(i) - 'a');
        }
        for (int i = 0; i < targetWord.length(); i++) {
            t.append(targetWord.charAt(i) - 'a');
        }
        return Integer.parseInt(f.toString()) + Integer.parseInt(s.toString()) == Integer.parseInt(t.toString());
    }
}
}