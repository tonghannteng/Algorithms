//  680. Valid Palindrome II

class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return palindrome(s, i+1, j) || palindrome(s, i, j-1);
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean palindrome(String s, int i, int j) {
        // int i = 0;
        // int j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}