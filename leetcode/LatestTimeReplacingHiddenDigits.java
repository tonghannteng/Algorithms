//  1736. Latest Time by Replacing Hidden Digits

class LatestTimeReplacingHiddenDigits {
    public String maximumTime(String time) {
        char[] arrChar = time.toCharArray();
        StringBuilder result = new StringBuilder();
        boolean first = time.charAt(0) == '?';
        boolean second = time.charAt(1) == '?';
        boolean third = time.charAt(3) == '?';
        boolean fourth = time.charAt(4) == '?';
        if ((first && arrChar[1] <= '3') || (first && arrChar[1] == '?')) {
            arrChar[0] = '2';
        } else if (first) {
            arrChar[0] = '1';
        }
        if (second && arrChar[0] != '2') {
            arrChar[1] = '9';
        } else if (second) {
            arrChar[1] = '3';
        }
        if (third) {
            arrChar[3] = '5';
        }
        if (fourth) {
            arrChar[4] = '9';
        }
        for (char c: arrChar) {
            result.append(c);
        }
        return result.toString();
    }
}