//  1869. Longer Contiguous Segments of Ones than Zeros

class LongerContiguousSegmentsOnesZeros {

    public boolean checkZeroOnes(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '1') {
                return true;
            }
        }
        int one = findLongestContiguousOne(s);
        int zero = findLongestContiguousZero(s);
        return one > zero;
    }

    public int findLongestContiguousZero(String s) {
        int max = 1;
        int count = 1;
        for (int i = 0; i < s.length() -1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public int findLongestContiguousOne(String s) {
        int max = 1;
        int count = 1;
        for (int i = 0; i < s.length() -1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}