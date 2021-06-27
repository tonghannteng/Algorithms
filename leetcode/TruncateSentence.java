//  1816. Truncate Sentence

class TruncateSentence {

    public String truncateSentence(String s, int k) {
        String [] arr = s.split(" ");
        int l = Math.min(arr.length, k);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < l; i++) {
            result.append(arr[i]).append(" ");
        }
        return result.toString().trim();
    }
}