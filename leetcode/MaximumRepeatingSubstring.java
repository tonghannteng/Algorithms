//  1668. Maximum Repeating Substring

class MaximumRepeatingSubstring {

    public int maxRepeating(String sequence, String word) {
        int result = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            result++;
            sb.append(word);
        }
        return result;
    }
}