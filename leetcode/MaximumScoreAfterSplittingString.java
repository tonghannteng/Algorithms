//  1422. Maximum Score After Splitting a String

class MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        int max = 0;
        if (s.length() == 0) {
            return max;
        }
        StringBuilder b = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            b.append(s.charAt(i - 1));
            if (countZero(b.toString()) + countOne(s.substring(i)) > max) {
                max = countZero(b.toString()) + countOne(s.substring(i));
            }
        }
        return max;
    }

    private int countOne(String one) {
        int c = 0;
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) == '1') c++;
        }
        return c;
    }

    private int countZero(String zero) {
        int c = 0;
        for (int i = 0; i < zero.length(); i++) {
            if (zero.charAt(i) == '0') c++;
        }
        return c;
    }
}