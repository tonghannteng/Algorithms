//  520. Detect Capital

class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) return false;
        if (word.length() == 1) return true;
        int count = 1;
        if (Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    count++;
                }
            }
            if (count == 1) {
                return true;
            } else return count == word.length();
        } else if ((Character.isLowerCase(word.charAt(0)))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    count++;
                }
            }
            return count == word.length();
        }
        return false;
    }
}