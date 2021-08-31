//  884. Uncommon Words from Two Sentences

class UncommonWordsTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> set = new HashSet<>();
        List<String> listS = new ArrayList<>();
        String [] arrS1 = s1.split(" ");
        String [] arrS2 = s2.split(" ");
        for (String w: arrS1) {
            if (set.contains(w)) {
                listS.add(w);
            } else {
                set.add(w);
            }
        }
        for (String w: arrS2) {
            if (set.contains(w)) {
                listS.add(w);
            } else {
                set.add(w);
            }
        }
        set.removeIf(listS::contains);
        return set.toArray(new String[]{});
    }
}