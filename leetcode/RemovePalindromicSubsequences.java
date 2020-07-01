//  1332. Remove Palindromic Subsequences

class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if (isPalindrome(s)) {
            return 1;
        } else {
            return 2;
        }
    }

    boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}