//  125. Valid Palindrome

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.trim().length() == 0 || s.trim().length() == 1) return true;
        int end = s.length() - 1;
        boolean result = true;
        for (int i = 0; i < s.length() && i < end; ) {
            char startChar = s.charAt(i);
            char endChar = s.charAt(end);
            if (Character.isLetterOrDigit(startChar) && Character.isLetterOrDigit(endChar)) {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    result = false;
                    break;
                } else {
                    i++;
                    end--;
                    result = true;
                }
            } else if (!Character.isLetterOrDigit(startChar) && Character.isLetterOrDigit(endChar)) {
                i++;
            } else if (Character.isLetterOrDigit(startChar) && !Character.isLetterOrDigit(endChar)) {
                end--;
            } else {
                i++;
                end--;
            }
        }
        return result;
    }
}