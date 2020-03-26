//  917. Reverse Only Letters

class ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {
        if (S.length() == 0) return "";
        char[] arr = S.toCharArray();
        int i = 0;
        int j = S.length() - 1;
        while (i < j) {
            if (Character.isAlphabetic(S.charAt(i)) && Character.isAlphabetic(S.charAt(j))) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!Character.isAlphabetic(S.charAt(j))) {
                j--;
            } else if (!Character.isAlphabetic(S.charAt(i))) {
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : arr) {
            result.append(c);
        }
        return result.toString();
    }
}