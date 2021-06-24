//  1832. Check if the Sentence Is Pangram

class CheckSentencePangram {

    public boolean checkIfPangram(String sentence) {
        int[] c = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            c[sentence.charAt(i) - 'a']++;

        }
        for (int a: c) {
            if (a < 1) {
                return false;
            }
        }
        return true;
    }
}