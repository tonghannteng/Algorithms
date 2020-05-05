//  387. First Unique Character in a String

class FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        String subLeft, subRight;
        for (int i = 0; i < s.length(); i++) {
            subRight = s.substring(i + 1);
            subLeft = s.substring(0, i);
            if (!subRight.contains(s.charAt(i) + "") && !subLeft.contains(s.charAt(i) + "")) {
                return i;
            }
        }
        return -1;

    }
}