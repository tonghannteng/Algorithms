//  1170. compare-strings-by-frequency-of-the-smallest-character

class CompareStringsByFrequencyOfTheSmallestCharacter {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> result = new ArrayList<>();
        int[] queriesArr = new int[queries.length];
        int[] wordsArr = new int[words.length];
        for (int i = 0; i < queriesArr.length; i++) {
            queriesArr[i] = smallerNumValue(queries[i]);
        }
        for (int i = 0; i < wordsArr.length; i++) {
            wordsArr[i] = smallerNumValue(words[i]);
        }
        int count;
        for (int i = 0; i < queries.length; i++) {
            count = 0;
            for (int j = 0; j < words.length; j++) {
                if (queriesArr[i] < wordsArr[j]) {
                    count++;
                }
            }
            result.add(count);
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    private int smallerNumValue(String s) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) - 'a', map.getOrDefault(s.charAt(i) - 'a', 1) + 1);
        }
        return map.firstEntry().getValue();
    }
}