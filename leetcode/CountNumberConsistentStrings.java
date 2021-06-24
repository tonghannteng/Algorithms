//  1684. Count the Number of Consistent Strings

class CountNumberConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for(String w: words) {
            if (consistentString(allowed, w)) {
                result++;
            }
        }
        return result;
    }

    public boolean consistentString(String allow, String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if (allow.contains(s.charAt(i)+"")) {
                count++;
            }
        }
        return count == s.length();
    }
}