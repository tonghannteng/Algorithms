//  1796. Second Largest Digit in a String

class SecondLargestDigitString {

    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                set.add(s.charAt(i) - 48);
            }
        }
        if (set.size() <= 1) {
            return -1;
        } else {
            return (int) set.toArray()[set.size() - 2];
        }
    }
}