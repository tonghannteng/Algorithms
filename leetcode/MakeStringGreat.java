//  1544. Make The String Great

class MakeStringGreat {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        char[] characters = s.toCharArray();
        for (char c : characters) {
            if (sb.length() > 0 && Math.abs(c - sb.charAt(sb.length() - 1)) == 'a' - 'A') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}