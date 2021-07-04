//  1758. Minimum Changes To Make Alternating Binary String

class MinimumChangesMakeBinary {

    public int minOperations(String s) {
        if (s.length() == 0) return 0;
        int count1 = 0;
        int count2 = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                s1.append("0");
                s2.append("1");
            } else {
                s1.append("1");
                s2.append("0");
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) != s.charAt(i)) count1++;
            if (s2.charAt(i) != s.charAt(i)) count2++;
        }
        return Math.min(count1, count2);
    }
}