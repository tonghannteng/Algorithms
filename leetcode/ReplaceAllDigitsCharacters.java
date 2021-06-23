//  1844. Replace All Digits with Characters

class ReplaceAllDigitsCharacters {

    public String replaceDigits(String s) {
        if (s == null) return null;
        if (s.length() == 1) return s;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i+=2) {
            result.append(s.charAt(i-1)).append((char) (s.charAt(i-1) + (s.charAt(i) - 48)));
        }
        if (s.length() % 2 == 0) {
            return result.toString();
        } else {
            return result.append(s.charAt(s.length() - 1)).toString();
        }

    }

}