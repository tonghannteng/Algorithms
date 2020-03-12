//  848. Shifting Letters

class ShiftingLetters {

    public String shiftingLetters(String S, int[] shifts) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] charArr = alpha.toCharArray();
        StringBuilder result = new StringBuilder();
        int[] arr = new int[shifts.length];
        int sum;
        for (int i = 0; i < shifts.length; i++) {
            shifts[i] = shifts[i] % 26;
        }
        for (int j = 0; j < shifts.length; j++) {
            sum = 0;
            for (int i = shifts.length - 1; i >= j; i--) {
                sum += shifts[i];
            }
            arr[j] = sum;
        }
        char[] charSArr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + (charSArr[i] - 97);
            result.append(charArr[arr[i] % 26]);
        }
        return result.toString();
    }
}