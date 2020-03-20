//  1317. convert-integer-to-the-sum-of-two-no-zero-integers

class ConvertTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        for (int i = 1; i <= n / 2; i++) {
            if (!containZero(i) && !containZero(n - i)) {
                result[0] = i;
                result[1] = n - i;
                break;
            }
        }
        return result;
    }

    boolean containZero(int num) {
        return String.valueOf(num).contains("0");
    }
}