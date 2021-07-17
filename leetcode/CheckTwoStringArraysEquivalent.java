//  1662. Check If Two String Arrays are Equivalent

class CheckTwoStringArraysEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String w: word1) {
            s1.append(w);
        }
        for(String w: word2) {
            s2.append(w);
        }
        return s1.toString().equals(s2.toString());
    }
}